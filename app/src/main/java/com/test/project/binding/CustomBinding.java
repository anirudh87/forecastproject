package com.test.project.binding;

import android.databinding.BindingAdapter;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.test.project.R;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class CustomBinding {

    @BindingAdapter("bind:imageUrl")
    public static void loadImage(ImageView imageView, String url) {
        String imageUrl = "http://openweathermap.org/img/w/"+url+".png";
        Picasso.with(imageView.getContext()).load(imageUrl).placeholder(R.drawable.no_image).resize(300, 300).into(imageView);
    }

    @BindingAdapter("bind:timestamp")
    public static void formatTimestamp(TextView textView, String timestamp) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss:S", Locale.getDefault());

        try {
            long value = Long.parseLong(timestamp);
            Date date = new Date(value * 1000);
            textView.setText(simpleDateFormat.format(date));
        }
        catch (Exception e) {
            Log.e("Exception", e.getMessage());
        }
    }
}
