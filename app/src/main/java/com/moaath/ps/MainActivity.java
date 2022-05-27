package com.moaath.ps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initListener();
    }

    private void initListener() {
        //todo this for hide action bar
        getSupportActionBar().hide();
        //todo this for splash screen three sec time
        new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    sleep(3000);
                    startActivity(new Intent(getBaseContext(), LoginActivty.class));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

    }
}