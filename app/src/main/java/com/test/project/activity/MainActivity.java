package com.test.project.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.widget.Toast;

import com.test.project.R;
import com.test.project.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.searchBtn.setOnClickListener(v -> startSearch());
    }

    public void startSearch() {
        String location = binding.location.getText().toString();
        if (TextUtils.isEmpty(location)) {
            Toast.makeText(this, getString(R.string.search_error), Toast.LENGTH_LONG).show();
        } else {
            Intent intent = new Intent(MainActivity.this, WeatherActivity.class);
            intent.putExtra(getString(R.string.searchkeyword), location);
            startActivity(intent);
        }
    }
}
