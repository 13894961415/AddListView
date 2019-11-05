package com.example.administrator.addlistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

        private LinearLayout layoutId;
        private TextView addid;
        private int counttag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layoutId = (LinearLayout) findViewById(R.id.layoutId);
        addid = (TextView)findViewById(R.id.addid);

        addid.setOnClickListener(this);

    }
    @Override
     public void onClick(View v){
        switch (v.getId()){
            case R.id.addid:
            addSelfView();
            counttag++;
            break;
            default:
        }

    }
    private void addSelfView() {
        LinearLayout childView1 = (LinearLayout) LayoutInflater.from(MainActivity.this)
                .inflate(R.layout.listview, layoutId, false);//添加方法
        childView1.setTag(counttag++);
        ImageView img1 = (ImageView)childView1.findViewById(R.id.img1);
        img1.setTag(counttag);
        img1.setOnClickListener(this);
        TextView t1 = (TextView)childView1.findViewById(R.id.t1);
        t1.setTag(counttag);
        t1.setOnClickListener(this);
        TextView t2 = (TextView)childView1.findViewById(R.id.t2);
        t2.setTag(counttag);
        t2.setOnClickListener(this);
        TextView t3 = (TextView)childView1.findViewById(R.id.t3);
        t3.setTag(counttag);
        t3.setOnClickListener(this);
        ImageView img2 = (ImageView)childView1.findViewById(R.id.img2);
        img2.setTag(counttag);
        img2.setOnClickListener(this);
        TextView t4 = (TextView)childView1.findViewById(R.id.t4);
        t4.setTag(counttag);
        t4.setOnClickListener(this);
        layoutId.addView(childView1);

        initSelfViewData(counttag);

    }

    private void initSelfViewData(int position) {
        Log.e("yu","这里是给自定义view赋值的方法，通过传进来的position = "+position+" 在数组中取出模型进行赋值");
    }
}
