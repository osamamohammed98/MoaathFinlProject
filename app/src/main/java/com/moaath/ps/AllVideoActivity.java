package com.moaath.ps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AllVideoActivity extends AppCompatActivity {
    private String name = "",
            desc = "",
            image = "",
            course_link = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_vedio);
        initListener();
        if(name.trim().length() == 0){
            getSupportActionBar().setTitle("");
        }else {
            getSupportActionBar().setTitle(name);
        }
    }

    private void initListener() {
        name = getIntent().getStringExtra("name");
        desc = getIntent().getStringExtra("desc");
        image = getIntent().getStringExtra("image");
        course_link = getIntent().getStringExtra("course_link");
    }
}