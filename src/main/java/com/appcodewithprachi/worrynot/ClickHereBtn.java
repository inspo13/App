package com.appcodewithprachi.worrynot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ClickHereBtn extends AppCompatActivity {
    Button login;
    EditText et;
    String st;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_here_btn);
        login = findViewById(R.id.submit);
        et = findViewById(R.id.name);
        login = (Button) findViewById(R.id.submit);

        sp = getSharedPreferences("login",MODE_PRIVATE);

        if(sp.getBoolean("logged",false)){
            goToWelcome();
        }

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToWelcome();
                sp.edit().putBoolean("logged",true).apply();

            }
        });

    }

    public void goToWelcome(){
        Intent i = new Intent(this,Welcome.class);
        st = et.getText().toString();
        i.putExtra("@string/user_name_welcome_activity",st);
        startActivity(i);
        finish();
    }
}

