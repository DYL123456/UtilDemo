package com.utildemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.utildemo.activity.DecorateActivity;
import com.utildemo.activity.GridViewActivity;
import com.utildemo.activity.ObserverActivity;

public class MainActivity extends AppCompatActivity {
    TextView window_size;
    Button btn_grid_view;
    Button btn_obesrver_model;
    Button btn_decorate_model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        window_size = findViewById(R.id.window_size);
        btn_grid_view = findViewById(R.id.btn_grid_view);
        btn_obesrver_model = findViewById(R.id.btn_obesrver_model);
        btn_decorate_model = findViewById(R.id.btn_decorate_model);

        DisplayMetrics dm = new DisplayMetrics();
        this.getWindowManager().getDefaultDisplay().getMetrics(dm);
        int screenWidth = dm.widthPixels;
        int screenHeight = dm.heightPixels;
        window_size.setText(screenWidth + "*" + screenHeight);
        final Intent intent = new Intent(this, GridViewActivity.class);
        final Intent intent1 = new Intent(this, ObserverActivity.class);
        final Intent intent2 = new Intent(this, DecorateActivity.class);

        btn_grid_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });

        btn_obesrver_model.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent1);
            }
        });

        btn_decorate_model.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2);
            }
        });
    }
}
