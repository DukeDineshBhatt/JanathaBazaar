package com.app.JanathaBazaar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.messaging.FirebaseMessaging;

import java.util.Timer;
import java.util.TimerTask;

public class Spalsh extends AppCompatActivity {

    Timer t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh);

        FirebaseMessaging.getInstance().subscribeToTopic("epk").addOnCompleteListener(task -> Log.d("task" , task.toString()));

        t = new Timer();

        t.schedule(new TimerTask() {
            @Override
            public void run() {

                Intent intent = new Intent(Spalsh.this , MainActivity.class);
                startActivity(intent);
                finish();

            }
        } , 1200);

    }
}
