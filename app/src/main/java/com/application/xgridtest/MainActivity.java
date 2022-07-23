package com.application.xgridtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.application.xgridtest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    PreferencesUtil preferencesUtil;
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        preferencesUtil = new PreferencesUtil(this);

        if (!preferencesUtil.getBoolean("Switch")) {
            setTheme(R.style.DarkTheme);
        } else {
            setTheme(R.style.LightTheme);
        }

        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());


        activityMainBinding.btnMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (!preferencesUtil.getBoolean("Switch")) {

                    preferencesUtil.setBoolean("Switch",true);
                    MainActivity.this.recreate();

                } else {
                    preferencesUtil.setBoolean("Switch",false);
                    MainActivity.this.recreate();
                }



            }
        });
    }
}