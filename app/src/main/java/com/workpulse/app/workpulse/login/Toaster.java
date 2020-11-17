package com.workpulse.app.workpulse.login;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Ambar on November 17, 2020
 */
public class Toaster {
    private Context mContext;

    public Toaster(Context context) {
        mContext = context;
    }

    public void showT(String message) {
        Toast.makeText(mContext, message, Toast.LENGTH_LONG).show();
    }
}