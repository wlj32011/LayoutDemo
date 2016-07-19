package cn.boc.layoutdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import cn.boc.layoutdemo.adapter.GridViewAdapter;
import cn.boc.layoutdemo.adapter.ListViewAdapter;

public class GridViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);


        GridView gridView = (GridView) findViewById(R.id.girdview);



        List<HashMap<String,String>> dataList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            HashMap<String,String> map = new HashMap<>();
            map.put("title","title"+i);
            map.put("content","content"+i);
            dataList.add(map);
        }


        GridViewAdapter gridViewAdapter = new GridViewAdapter(this,dataList);

        gridView.setAdapter(gridViewAdapter);
    }
}
