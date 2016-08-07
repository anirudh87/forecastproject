package com.test.project.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.test.project.BR;
import com.test.project.R;
import com.test.project.model.Forecast;

import java.util.List;

public class ForecastListAdapter extends RecyclerView.Adapter<ForecastListAdapter.CustomViewHolder> {
    private List<Forecast> forecastList;


    public ForecastListAdapter(Context context, List<Forecast> forecastList) {
        this.forecastList = forecastList;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_layout, viewGroup, false);
        CustomViewHolder viewHolder = new CustomViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final CustomViewHolder customViewHolder, int position) {
        final Forecast forecast = forecastList.get(position);

        customViewHolder.getBinding().setVariable(BR.forecast, forecast);
        customViewHolder.getBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return forecastList.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        private ViewDataBinding binding;

        public CustomViewHolder(View view) {
            super(view);
            binding = DataBindingUtil.bind(view);
        }

        public ViewDataBinding getBinding() {
            return binding;
        }
    }

    public void addAll(List<Forecast> list) {
        forecastList.clear();
        forecastList.addAll(list);
        notifyDataSetChanged();
    }

}
