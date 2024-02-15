package com.berkantyurtseven.finalcountdown;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);

        new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                textView.setText("Last ->" + millisUntilFinished / 1000);

            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(getApplicationContext() , BoomActivity.class);
                startActivity(intent);

            }
        }.start();
    }
}