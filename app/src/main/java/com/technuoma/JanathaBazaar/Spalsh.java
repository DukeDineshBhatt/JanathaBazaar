package com.technuoma.JanathaBazaar;

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

        FirebaseMessaging.getInstance().subscribeToTopic("janatha").addOnCompleteListener(task -> Log.d("task" , task.toString()));

        t = new Timer();

        String id = SharePreferenceUtils.getInstance().getString("userId");

        t.schedule(new TimerTask() {
            @Override
            public void run() {

                if (id.length() > 0)
                {
                    Intent intent = new Intent(Spalsh.this , MainActivity.class);
                    startActivity(intent);
                    finish();
                }
                else
                {
                    Intent intent = new Intent(Spalsh.this , Login.class);
                    startActivity(intent);
                    finish();
                }



            }
        } , 1200);

    }
}
