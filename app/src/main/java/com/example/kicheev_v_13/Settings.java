package com.example.kicheev_v_13;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Settings extends AppCompatActivity implements View.OnClickListener {
Button btn4,btn5;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        btn4 = findViewById(R.id.button6);
        btn4.setOnClickListener(this);
        btn5 = findViewById(R.id.button8);
        btn5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch(v.getId()){




            case R.id.button6:
                intent = new Intent(this,Auto.class);
                startActivity(intent);
                break;
            case R.id.button8:
                intent = new Intent(this,personal_area.class);
                startActivity(intent);
                break;
        }

    }
}