package com.example.intentexplicit28042021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        if (intent != null){
//            1 : Nhận dạng string
//            String chuoi = intent.getStringExtra(AppConstant.KEY_INTENT_STRING);
//            Toast.makeText(this, chuoi, Toast.LENGTH_SHORT).show();
//            2 : Nhận dạng array string
            String[] arrNames = intent.getStringArrayExtra(AppConstant.KEY_INTENT_ARRAY_STRING);
            Log.d("BBB",arrNames.length + "");
        }
    }
}