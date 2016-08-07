package com.test.project.fragment;

import android.app.ProgressDialog;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.test.project.R;
import com.test.project.adapter.ForecastListAdapter;
import com.test.project.databinding.FragmentForecastBinding;
import com.test.project.model.ForecastData;
import com.test.project.retrofit.CommunicationManager;
import com.test.project.util.SimpleDividerItem;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class ForecastFragment extends Fragment {
    private String searchKeyword;
    private FragmentForecastBinding binding;
    private ForecastListAdapter objAdapter;
    private ProgressDialog pd;

    public static ForecastFragment newInstance(String searchKeyword) {
        Bundle bundle = new Bundle();
        bundle.putString("searchkeyword", searchKeyword);
        ForecastFragment fragment = new ForecastFragment();
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
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_forecast, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        binding.forecastList.setLayoutManager(layoutManager);
        binding.forecastList.addItemDecoration(new SimpleDividerItem(getActivity()));


        if (searchKeyword != null) {
            showLoading();
            CommunicationManager comm = new CommunicationManager();
            Observable<ForecastData> data = comm.getForecastData(searchKeyword);

            data.subscribeOn(Schedulers.newThread())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Subscriber<ForecastData>() {
                        @Override
                        public void onCompleted() {
                            hideLoading();
                        }

                        @Override
                        public void onError(Throwable e) {
                            hideLoading();
                            Toast.makeText(getContext(), getString(R.string.error_message), Toast.LENGTH_LONG).show();
                            binding.setShowingdata(false);
                        }

                        @Override
                        public void onNext(ForecastData data) {
                            if (data.getCity() != null) {
                                binding.setForecastdata(data);
                                objAdapter = new ForecastListAdapter(getActivity(), data.getList());
                                binding.forecastList.setAdapter(objAdapter);
                                binding.setShowingdata(true);
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
