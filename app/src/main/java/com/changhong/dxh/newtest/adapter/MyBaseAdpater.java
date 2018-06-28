package com.changhong.dxh.newtest.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.changhong.dxh.newtest.R;

import java.util.List;

/**
 * @PackageName:com.changhong.dxh.newtest.adapter
 * @ClassNmae:
 * @Description:
 * @Athor: rosalind
 * @Email: xiaohong.deng@changhong.com
 * @Date： 20182018/6/27 16:54
 */
public class MyBaseAdpater<T> extends BaseAdapter {
   private Context context;
   private LayoutInflater inflater;
   private int layoutId;
   private int variableId;
   private List<T> list;

    public MyBaseAdpater(Context context, List<T> list) {
        this.context = context;
        this.list = list;
        inflater=LayoutInflater.from(context);

    }

    public MyBaseAdpater(Context context, int layoutId, int variableId, List<T> list) {
        this.context = context;
        this.layoutId = layoutId;
        this.variableId = variableId;
        this.list = list;
        inflater= LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list==null?0:list.size();
    }

    @Override
    public Object getItem(int i) {
        return list==null?0:list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewDataBinding dataBinding;
        if (view==null)
        {
            dataBinding= DataBindingUtil.inflate(inflater,layoutId,viewGroup,false);
        }else {
            dataBinding=DataBindingUtil.getBinding(view);
        }
        dataBinding.setVariable(variableId, list.get(i));
        return dataBinding.getRoot();

    }
}
