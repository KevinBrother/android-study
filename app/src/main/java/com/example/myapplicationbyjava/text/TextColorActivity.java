package com.example.myapplicationbyjava.text;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplicationbyjava.R;

public class TextColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_color);

        TextView clazz = findViewById(R.id.clazz);
        clazz.setText("通过 class 设置颜色");
        clazz.setTextColor(0xff00ff00);
    }
}