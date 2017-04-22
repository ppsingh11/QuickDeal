package com.example.prashantpratap.quickdeal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

/**
 * Created by Prashant Pratap on 22-04-2017.
 */

public class splash extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        new CountDownTimer(1000,2500){
            @Override
            public void onTick(long millisUntilFinished){}

            @Override
            public void onFinish(){

                Intent i = new Intent(splash.this,MainActivity.class);
                startActivity(i);

            }
        }.start();

    }

}
