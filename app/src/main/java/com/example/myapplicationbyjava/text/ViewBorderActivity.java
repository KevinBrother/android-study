package com.example.myapplicationbyjava.text;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myapplicationbyjava.R;
import com.example.myapplicationbyjava.utils.Utils;

public class ViewBorderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_border);

        TextView textView = findViewById(R.id.tv_code);

        ViewGroup.LayoutParams params = textView.getLayoutParams();
        params.width = Utils.dip2px(this, 300);

        textView.setLayoutParams(params);
    }
}