package com.changhong.dxh.newtest;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mvvmList;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mvvmList = (Button) findViewById(R.id.mvvm_list);
        button2 = (Button) findViewById(R.id.button2);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.mvvm_list:
                toTestActivity(ListActivity.class);
                break;

        }

    }

    private void toTestActivity(Class<?> cls){
        Intent intent=new Intent();
        intent.setClass(MainActivity.this,cls);
        startActivity(intent);

    }
}
