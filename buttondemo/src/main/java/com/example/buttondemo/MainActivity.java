package com.example.buttondemo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Context mcount;

    private int rand(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Animation amiFadeIn= AnimationUtils.loadAnimation(this,R.anim.translate_right);
        final Animation amiFadeOut= AnimationUtils.loadAnimation(this,R.anim.translate_left);



        mcount = this;

        final Button button1 = (Button) findViewById(R.id.button1);
        final Button button2 = (Button) findViewById(R.id.button2);
        final Button button3 = (Button) findViewById(R.id.button3);
        final Button button4 = (Button) findViewById(R.id.button4);
        final Button button5 = (Button) findViewById(R.id.button5);

        final int[] clrs = {R.color.colorAccent, R.color.colorAccent1, R.color.colorAccent2, R.color.colorPrimary, R.color.colorPrimaryDark};//array of color

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rnd = rand(0, 4);
                button1.setBackgroundColor(mcount.getResources().getColor(clrs[rnd]));
                //button1.startAnimation();

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rnd = rand(0, 4);
                button2.setBackgroundColor(mcount.getResources().getColor(clrs[rnd]));
                button2.startAnimation(amiFadeIn);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rnd = rand(0, 4);
                button3.setBackgroundColor(mcount.getResources().getColor(clrs[rnd]));
                button3.startAnimation(amiFadeOut);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rnd = rand(0, 4);
                button4.setBackgroundColor(mcount.getResources().getColor(clrs[rnd]));
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rnd = rand(0, 4);
                button5.setBackgroundColor(mcount.getResources().getColor(clrs[rnd]));
            }
        });


    }
}
