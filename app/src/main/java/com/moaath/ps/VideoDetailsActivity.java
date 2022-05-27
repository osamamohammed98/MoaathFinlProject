package com.moaath.ps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class VideoDetailsActivity extends AppCompatActivity {
    private String name = "",
            desc = "",
            image = "",
            course_link = "";

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_details);
        initView();
        initListener();
        if (name.trim().length() == 0) {
            getSupportActionBar().setTitle("");
        } else {
            getSupportActionBar().setTitle(name);
        }
    }

    private void initView() {
        imageView =  findViewById(R.id.ivCourseImage);
        textView =  findViewById(R.id.ivCourseText);
    }

    private void initListener() {
        name = getIntent().getStringExtra("name");
        desc = getIntent().getStringExtra("desc");
        image = getIntent().getStringExtra("image");
        course_link = getIntent().getStringExtra("course_link");
        textView.setText(desc);
        picasso(image , imageView);
    }
    private void picasso(String imageUrl, ImageView imageView) {
        Picasso.get()
                .load(imageUrl)
                .placeholder(R.drawable.app_logo)
                .error(R.drawable.app_logo)
                .into(imageView);
    }

    public void onWatchVideoClick(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(course_link));
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }
}