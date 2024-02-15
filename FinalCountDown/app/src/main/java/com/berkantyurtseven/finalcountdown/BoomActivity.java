package com.berkantyurtseven.finalcountdown;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BoomActivity extends AppCompatActivity {

    TextView textView2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boom);
        textView2 = findViewById(R.id.textView2);

    }
}