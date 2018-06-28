package com.changhong.dxh.newtest.ui;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.changhong.dxh.newtest.R;
import com.changhong.dxh.newtest.adapter.MyBaseAdpater;
import com.changhong.dxh.newtest.bean.FoodBean;

import java.util.ArrayList;
import java.util.List;



public class ListActivity extends AppCompatActivity {

    private List<FoodBean> foods=new ArrayList<>();
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listView=(ListView)this.findViewById(R.id.list_view);
        initData();
        MyBaseAdpater<FoodBean> adpater=new MyBaseAdpater<>(ListActivity.this, R.layout.item_list,com.changhong.dxh.newtest.BR.food,foods);
        listView.setAdapter(adpater);
    }

    private void initData() {
        for (int i=0;i<10;i++){
            FoodBean foodBean=new FoodBean("这个饭很香呀就是一个ListView，左边显示图片，右边显示文本，这样一个效果。OK，那就一步一步来吧，先是主布局：","http://img2.cache.netease.com/auto/2016/7/28/201607282215432cd8a.jpg","列子","i don't know where to find a example");
            foods.add(foodBean);
        }
    }

}
