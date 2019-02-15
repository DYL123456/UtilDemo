package com.utildemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.utildemo.R;
import com.utildemo.interfac.Observer;
import com.utildemo.observer.PersonObserver;
import com.utildemo.observer.XiaoSongSubject;

/**
 * Created by ylding on 2019/2/15.
 */
public class ObserverActivity extends Activity implements View.OnClickListener {
    TextView textView;
    private PersonObserver person1, person2, person3;
    private XiaoSongSubject mSubject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer);
        initView();
        //创建被观察者（具体主题）
        mSubject = new XiaoSongSubject();
    }

    private void initView() {
        textView = findViewById(R.id.observer_text);
        findViewById(R.id.btn_add1).setOnClickListener(this);
        findViewById(R.id.btn_add2).setOnClickListener(this);
        findViewById(R.id.btn_add3).setOnClickListener(this);
        findViewById(R.id.btn_notify).setOnClickListener(this);
        findViewById(R.id.btn_delete).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_add1:
                if (null == person1) {
                    person1 = new PersonObserver("小明");
                    mSubject.addObserver(person1);
                    Toast.makeText(this, "小明关注了我", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "小明已关注我了，不能再重复操作", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btn_add2:
                if (null == person2) {
                    person2 = new PersonObserver("小亮");
                    mSubject.addObserver(person2);
                    Toast.makeText(this, "小亮关注了我", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "小亮已关注我了，不能再重复操作", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btn_add3:
                if (null == person3) {
                    person3 = new PersonObserver("小白");
                    mSubject.addObserver(person3);
                    Toast.makeText(this, "小白关注了我", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "小白已关注我了，不能再重复操作", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btn_notify:
                textView.setText("");
                mSubject.notifyObesrver("小送更新微博啦~ 快来看看吧", textView);
                break;
            case R.id.btn_delete:
                if (null != person1) {
                    mSubject.deleteObserver(person1);
                }
                if (null != person2) {
                    mSubject.deleteObserver(person2);
                }
                if (null != person3) {
                    mSubject.deleteObserver(person3);
                }
                Toast.makeText(this, "我已经删除了所有的观察者", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }

    }
}
