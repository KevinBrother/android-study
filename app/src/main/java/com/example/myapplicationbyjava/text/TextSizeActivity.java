package com.example.myapplicationbyjava.text;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplicationbyjava.R;

public class TextSizeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_size);

        TextView  clazz = findViewById(R.id.clazz);
        // class 设置默认是 sp ？
        clazz.setTextSize(30);
    }
}