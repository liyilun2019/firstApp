package com.example.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class MyGridViewAdapter extends BaseAdapter {
    private Context mContent;
    private LayoutInflater layoutInflater;
    public MyGridViewAdapter(Context context){
        mContent = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if(convertView == null){
            convertView = layoutInflater.inflate(R.layout.grid_layout_res,null);
            //生成一个ViewHolder的对象
            holder = new ViewHolder();
            holder.imageView=convertView.findViewById(R.id.grid_image_Id);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        if(position%2==0) {
            holder.imageView.setImageResource(R.mipmap.ring);
        }else{
            holder.imageView.setImageResource(R.mipmap.ic_launcher);
        }
        return convertView;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

}
