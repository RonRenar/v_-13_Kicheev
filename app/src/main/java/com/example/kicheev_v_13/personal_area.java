package com.example.kicheev_v_13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class personal_area extends AppCompatActivity implements View.OnClickListener{
Button btn1, btn2 , btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_area);
        btn1 = findViewById(R.id.button3);
        btn1.setOnClickListener(this);
        btn2 = findViewById(R.id.button4);
        btn2.setOnClickListener(this);
        btn3 = findViewById(R.id.button5);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch(v.getId()){

            case R.id.button3:
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData((Uri.parse("tel:+7 901 671 45 74")));
                startActivity(intent);
                break;


            case R.id.button4:
                intent = new Intent(this,Auto.class);
                startActivity(intent);
                break;
            case R.id.button5:
                intent = new Intent(this,Settings.class);
                startActivity(intent);
                break;
        }


    }
}