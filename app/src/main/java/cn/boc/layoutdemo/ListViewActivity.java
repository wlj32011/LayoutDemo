package cn.boc.layoutdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import cn.boc.layoutdemo.adapter.ListViewAdapter;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ListView listView = (ListView) findViewById(R.id.listview);


//        List<String> stringList = new ArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            stringList.add("test"+i);
//        }


//        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,stringList);
//
//
//        listView.setAdapter(arrayAdapter);


        List<HashMap<String,String>> dataList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            HashMap<String,String> map = new HashMap<>();
            map.put("title","title"+i);
            map.put("content","content"+i);
            dataList.add(map);
        }



        ListViewAdapter listviewAdapter = new ListViewAdapter(this,dataList);

        listView.setAdapter(listviewAdapter);

    }
}
