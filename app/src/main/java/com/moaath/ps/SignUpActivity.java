package com.moaath.ps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {
    EditText editTextEmail, editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        initView();
        initListener();
    }

    private void initView() {
        editTextEmail = findViewById(R.id.emailET);
        editTextPassword = findViewById(R.id.passwordEt);
    }

    private void initListener() {
        getSupportActionBar().hide();
    }

    public void onLoginClick(View view) {
        onBackPressed();
    }

    public void onSignUpClick(View view) {
        if (TextUtils.isEmpty(editTextEmail.getText().toString().trim())) {
            editTextEmail.setError("Please enter this field");
            return;
        }
        if (!editTextEmail.getText().toString().contains("@")) {
            editTextEmail.setError("Please enter valid email");
            return;
        }
        if (TextUtils.isEmpty(editTextPassword.getText().toString().trim())) {
            editTextPassword.setError("Please enter this field");
            return;
        }
        if (editTextPassword.getText().toString().trim().length() < 6) {
            editTextPassword.setError("Please make password more than 6 char");
            return;
        }
        startActivity(new Intent(getBaseContext(), HomePage.class)
                .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK));
    }
}