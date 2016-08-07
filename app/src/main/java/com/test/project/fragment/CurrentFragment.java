package com.test.project.fragment;

import android.app.ProgressDialog;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.test.project.R;
import com.test.project.databinding.FragmentCurrentBinding;
import com.test.project.model.CurrentData;
import com.test.project.retrofit.CommunicationManager;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class CurrentFragment extends Fragment {
    private String searchKeyword;
    private FragmentCurrentBinding binding;
    private ProgressDialog pd;

    public static CurrentFragment newInstance(String searchKeyword) {
        Bundle bundle = new Bundle();
        bundle.putString("searchkeyword", searchKeyword);
        CurrentFragment fragment = new CurrentFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle != null) {
            searchKeyword = bundle.getString("searchkeyword", null);
        }

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_current, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        if (searchKeyword != null) {
            showLoading();
            CommunicationManager comm = new CommunicationManager();
            Observable<CurrentData> data = comm.getCurrentData(searchKeyword);

            data.subscribeOn(Schedulers.newThread())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Subscriber<CurrentData>() {
                        @Override
                        public void onCompleted() {
                            hideLoading();
                        }

                        @Override
                        public void onError(Throwable e) {
                            hideLoading();
                            binding.setShowingdata(false);
                            Toast.makeText(getContext(), getString(R.string.error_message), Toast.LENGTH_LONG).show();
                        }

                        @Override
                        public void onNext(CurrentData data) {
                            if (data.getMain() != null) {
                                binding.setShowingdata(true);
                                binding.setCurrentdata(data);
                            } else {
                                binding.setShowingdata(false);
                            }
                        }
                    });
        }
    }

    private void showLoading() {
        pd = new ProgressDialog(getContext());
        pd.setMessage("Fetching Items..");
        pd.setCancelable(false);
        pd.show();
    }

    private void hideLoading() {
        if (pd.isShowing()) {
            pd.dismiss();
            pd.cancel();
        }
    }
}
