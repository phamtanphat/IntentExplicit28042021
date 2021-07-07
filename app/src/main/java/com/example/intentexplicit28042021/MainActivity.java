package com.example.intentexplicit28042021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mBtnSendString,mBtnSendArrayString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnSendString = findViewById(R.id.buttonSendString);
        mBtnSendArrayString = findViewById(R.id.buttonSendArrayString);

        mBtnSendString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra(AppConstant.KEY_INTENT_STRING,"Hello");
                startActivity(intent);
            }
        });
        mBtnSendArrayString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] arrNames = {"Tèo","Tí","Tủn"};

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra(AppConstant.KEY_INTENT_ARRAY_STRING,arrNames);
                startActivity(intent);
            }
        });
    }
}