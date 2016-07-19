package cn.boc.layoutdemo.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

import cn.boc.layoutdemo.R;

/**
 * Created by wanglj on 16/7/18.
 */

public class GridViewAdapter extends BaseAdapter{


    private Context context;
    private List<HashMap<String,String>> dataList;

    public GridViewAdapter(Context context, List<HashMap<String,String>> dataList){
        this.context = context;
        this.dataList = dataList;
    }

    @Override
    public int getCount() {
        return dataList.size();
    }

    @Override
    public HashMap<String,String> getItem(int i) {
        return dataList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


        Log.e("ListViewAdapter", "getview");

        ViewHolder viewHolder = null;
        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.item_grid_view,viewGroup,false);
            viewHolder = new ViewHolder();
            viewHolder.title = (TextView) view.findViewById(R.id.title);
            viewHolder.content = (TextView) view.findViewById(R.id.content);
            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) view.getTag();
        }


        HashMap<String,String> item = getItem(i);

//        viewHolder.title.setText(item.get("title"));
        viewHolder.content.setText(item.get("content"));


        return view;
    }


    class ViewHolder{
        TextView title,content;

    }
}
