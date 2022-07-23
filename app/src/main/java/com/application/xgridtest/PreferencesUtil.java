package com.application.xgridtest;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferencesUtil {

    Context mContext;

    public PreferencesUtil(Context context) {

        mContext = context;
    }

    public void setBoolean(String key, Boolean value) {
        SharedPreferences.Editor editor = mContext.getSharedPreferences("Pref", Context.MODE_PRIVATE).edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    public Boolean getBoolean(String key) {
        SharedPreferences editor = mContext.getSharedPreferences("Pref", Context.MODE_PRIVATE);
        return editor.getBoolean(key, false);
    }
}
