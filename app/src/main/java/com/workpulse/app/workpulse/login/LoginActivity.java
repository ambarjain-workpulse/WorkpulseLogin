package com.workpulse.app.workpulse.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.workpulse.app.workpulse.loginlibrary.Toaster;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        new Toaster(this);
    }
}