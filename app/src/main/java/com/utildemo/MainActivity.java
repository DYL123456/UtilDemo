package com.utildemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.utildemo.activity.GridViewActivity;

public class MainActivity extends AppCompatActivity {
    TextView window_size;
    Button btn_grid_view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        window_size = findViewById(R.id.window_size);
        btn_grid_view = findViewById(R.id.btn_grid_view);

        DisplayMetrics dm = new DisplayMetrics();
        this.getWindowManager().getDefaultDisplay().getMetrics(dm);
        int screenWidth = dm.widthPixels;
        int screenHeight = dm.heightPixels;
        Log.i("dyl", "screenWidth" + screenWidth);
        Log.i("dyl", "screenHeight" + screenHeight);
        window_size.setText(screenWidth + "*" + screenHeight);
        final Intent intent = new Intent(this, GridViewActivity.class);
        btn_grid_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }
}
