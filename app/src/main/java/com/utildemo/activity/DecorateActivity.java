package com.utildemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.utildemo.R;
import com.utildemo.decorate.FiredEgg;
import com.utildemo.decorate.Ham;
import com.utildemo.decorate.Pancake;
import com.utildemo.decorate.Roujiamo;
import com.utildemo.decorate.TornCake;

import java.util.logging.Logger;

/**
 * Created by ylding on 2019/2/16.
 * 有一个小摊卖手抓饼和肉夹馍的，有时候中午不想吃饭就会去光顾一下那个小摊，点了手抓饼之后往往还可以
 * 在这个基础之上增加一些配料，例如煎蛋，火腿片等等，每个配料的价格都不一样，不管你怎么配配料，
 * 最终价格是手抓饼基础价加上每一种所选配料价格的总和。
 *
 * 主体是手抓饼和肉夹馍，而配料则是装饰者
 */
public class DecorateActivity extends Activity {
    TextView textView;
    TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decorate);
        textView = findViewById(R.id.tv_decorate);
        textView1 = findViewById(R.id.tv_decorate1);

        Pancake tornCake = new TornCake();
        textView.setText(tornCake.getDesc() + "和" + tornCake.price());
        Log.i("dyl","textView"+textView.getText());

        Pancake roujiamo = new Roujiamo();
        roujiamo = new FiredEgg(roujiamo);
        roujiamo = new FiredEgg(roujiamo);
        roujiamo = new Ham(roujiamo);
        textView1.setText(roujiamo.getDesc() + "和" + roujiamo.price());
        Log.i("dyl","textView1"+textView1.getText());

    }
}
