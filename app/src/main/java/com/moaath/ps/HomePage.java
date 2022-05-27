package com.moaath.ps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        initListener();
    }

    private void initListener() {
        getSupportActionBar().setTitle("Home Page Course");
        _firstCourse();
        _secondCourse();
        _thirdCourse();
        _frothedCourse();
        _fiveCourse();
        _sixCourse();


    }

    private void _sixCourse() {
        ImageView iv = findViewById(R.id.ln_courseSixIV);
        picasso(
                "https://blog-frontend.envato.com/cdn-cgi/image/width=1200,quality=85,format=auto/uploads/2020/07/SOC091_FreeTutsCourses_Photoshop@2x.png",
                iv
        );
        TextView tv = findViewById(R.id.ln_courseSixTV);
        tv.setText("Welcome to 30 Days of Photoshop! For the next 30 days we'll be exploring the magic of Photoshop, from the most common tools and techniques, to professional skills, to photo retouching and compositing! Visit PHLEARN.com to download the calendar and schedule. It's never been a better time to learn Photoshop! We'll see you tomorrow.\n");
        findViewById(R.id.ln_courseSix).setOnClickListener(view -> {
            goToCourseDetails("Photoshop",
                    "Welcome to 30 Days of Photoshop! For the next 30 days we'll be exploring the magic of Photoshop, from the most common tools and techniques, to professional skills, to photo retouching and compositing! Visit PHLEARN.com to download the calendar and schedule. It's never been a better time to learn Photoshop! We'll see you tomorrow.\n",
                    "https://blog-frontend.envato.com/cdn-cgi/image/width=1200,quality=85,format=auto/uploads/2020/07/SOC091_FreeTutsCourses_Photoshop@2x.png",
                    "https://www.youtube.com/playlist?list=PL7JpMMpENaD3KL_lvmw4eS5U5AD746yKB");
        });
    }


    private void _fiveCourse() {//five
        ImageView iv = findViewById(R.id.ln_courseFiveIV);
        picasso(
                "https://cdn.flippednormals.com/wp-content/uploads/2020/07/04184732/FlippedBanner.jpg",
                iv
        );
        TextView tv = findViewById(R.id.ln_courseFiveTV);
        tv.setText("Auto-save! Incremental saving! Infinite undos! This video shows you how to set all of these things up in Maya. If you're going to be using Maya then you really need to get these set up properly to save you tears and the urge to punch something later.\n");

        findViewById(R.id.ln_courseFive).setOnClickListener(view -> {
            goToCourseDetails("Maya",
                    "Auto-save! Incremental saving! Infinite undos! This video shows you how to set all of these things up in Maya. If you're going to be using Maya then you really need to get these set up properly to save you tears and the urge to punch something later.\n",
                    "https://cdn.flippednormals.com/wp-content/uploads/2020/07/04184732/FlippedBanner.jpg",
                    "https://www.youtube.com/playlist?list=PLsPHRLf6UN4k0_AfrTzLmK4iDV9J97-qR");
        });
    }

    private void _frothedCourse() {//frothed
        ImageView iv = findViewById(R.id.ln_courseFourIV);
        picasso(
                "https://i.ytimg.com/vi/9UWqDfNld34/maxresdefault.jpg",
                iv
        );
        TextView tv = findViewById(R.id.ln_courseFourTV);
        tv.setText("5 Essential Video Effects every editor should know! (Adobe Premiere Pro CC Tutorial)\n");

        findViewById(R.id.ln_courseFour).setOnClickListener(view -> {
            goToCourseDetails("Premiere",
                    "5 Essential Video Effects every editor should know! (Adobe Premiere Pro CC Tutorial)\n",
                    "https://i.ytimg.com/vi/9UWqDfNld34/maxresdefault.jpg",
                    "https://www.youtube.com/playlist?list=PLBrRXoTJAkZBl3XDQEPjVj4okFAHQrVex");
        });
    }

    private void _thirdCourse() {//third
        ImageView iv = findViewById(R.id.ln_courseThreeIV);
        picasso(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ8Yiuf2EvDPNdD89bihPPYKPVbQvz1QZUyfg&usqp=CAU",
                iv
        );
        TextView tv = findViewById(R.id.ln_courseThreeTV);
        tv.setText("Build this AWESOME Glass Planet from scratch in this Adobe Illustrator tutorial!\n" +
                "We’ll create line art from simple shape tools and a little pathfinder work and then build out gradients using a custom palette of colors to build out a really cool looking piece of artwork!\n"
        );

        findViewById(R.id.ln_courseThree).setOnClickListener(view -> {
            goToCourseDetails("illustration",
                    "Build this AWESOME Glass Planet from scratch in this Adobe Illustrator tutorial!\n" +
                            "We’ll create line art from simple shape tools and a little pathfinder work and then build out gradients using a custom palette of colors to build out a really cool looking piece of artwork!\n",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ8Yiuf2EvDPNdD89bihPPYKPVbQvz1QZUyfg&usqp=CAU",
                    "https://www.youtube.com/playlist?list=PLwnXQvUxjbNsvCG_rJJ8vzhbqtEjphKsf");
        });
    }

    private void _secondCourse() {//second
        ImageView iv = findViewById(R.id.ln_courseTwoIV);
        picasso(
                "https://i.ytimg.com/vi/N9D_0UQrOhA/maxresdefault.jpg",
                iv
        );
        TextView tv = findViewById(R.id.ln_courseTwoTV);
        tv.setText("Welcome to the complete beginners guide to Adobe InDesign CS5. In this series I will be demonstrating how to create a small project in Adobe Indesign from start to finish. To help break down the process I have structured the course in 3 main sections");

        findViewById(R.id.ln_courseTwo).setOnClickListener(view -> {
            goToCourseDetails("Indesign",
                    "Welcome to the complete beginners guide to Adobe InDesign CS5. In this series I will be demonstrating how to create a small project in Adobe Indesign from start to finish. To help break down the process I have structured the course in 3 main sections",
                    "https://i.ytimg.com/vi/N9D_0UQrOhA/maxresdefault.jpg",
                    "https://www.youtube.com/playlist?list=PLYfCBK8IplO7YoUHtYKxavLHO-31C-Vky");
        });
    }

    private void _firstCourse() {
        ImageView iv = findViewById(R.id.ln_courseOneIV);
        picasso(
                "https://ipc.alquds.edu/wp-content/uploads/2015/12/android-app-banner.jpg",
                iv
        );
        TextView tv = findViewById(R.id.ln_courseOneTV);
        tv.setText("Android tutorial for beginners - Learn Android Programming and how to develop android mobile phone and ipad applications starting from Environment setup, application components, activity lifecycle, service lifecycle, application architecture, publishing application,Android Example,Basics,Developer,Example Source Code,Tutorials,Advance Examples,Learn Android ,Basics Tutorial,Apps, debugging  applications, handling events, layouts, menus,  user interface controls, styles and themes,  handling rotation, fonts management, send email, data storage, managing media, send sms, phone calls.android programming tutorials for beginners pdf\n");

        findViewById(R.id.ln_courseOne).setOnClickListener(view -> {
            goToCourseDetails("android",
                    "Android tutorial for beginners - Learn Android Programming and how to develop android mobile phone and ipad applications starting from Environment setup, application components, activity lifecycle, service lifecycle, application architecture, publishing application,Android Example,Basics,Developer,Example Source Code,Tutorials,Advance Examples,Learn Android ,Basics Tutorial,Apps, debugging  applications, handling events, layouts, menus,  user interface controls, styles and themes,  handling rotation, fonts management, send email, data storage, managing media, send sms, phone calls.android programming tutorials for beginners pdf\n",
                    "https://ipc.alquds.edu/wp-content/uploads/2015/12/android-app-banner.jpg",
                    "https://www.youtube.com/playlist?list=PLS1QulWo1RIbb1cYyzZpLFCKvdYV_yJ-E");
        });
    }


//    private void goToAllVideoPage(String coursName, String course_descriptions, String image, String course_link) {
//        startActivity(new Intent(getBaseContext(), AllVideoActivity.class)
//                .putExtra("name", coursName)
//                .putExtra("desc", course_descriptions)
//                .putExtra("image", image)
//                .putExtra("course_link", course_link)
//        );
//    }

    private void goToCourseDetails(String coursName, String course_descriptions, String image, String course_link) {
        startActivity(new Intent(getBaseContext(), VideoDetailsActivity.class)
                .putExtra("name", coursName)
                .putExtra("desc", course_descriptions)
                .putExtra("image", image)
                .putExtra("course_link", course_link)
        );
    }

    private void picasso(String imageUrl, ImageView imageView) {
        Picasso.get()
                .load(imageUrl)
                .placeholder(R.drawable.app_logo)
                .error(R.drawable.app_logo)
                .into(imageView);
    }
}