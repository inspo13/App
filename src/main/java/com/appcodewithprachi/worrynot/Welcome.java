package com.appcodewithprachi.worrynot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {
    TextView tv;
    String st;
    Button next_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        tv = findViewById(R.id.welcome);
        st = getIntent().getExtras().getString("@string/user_name_welcome_activity");
        tv.setText(st);
        next_btn = (Button) findViewById(R.id.Next_btn);

        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(Welcome.this, AnalysisSegregationQues.class);
                startActivity(intentLoadNewActivity);
            }
        });

    }
}