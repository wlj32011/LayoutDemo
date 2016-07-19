package cn.boc.layoutdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import cn.boc.layoutdemo.adapter.RecyclerViewAdapter;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static android.icu.text.RelativeDateTimeFormatter.Direction.THIS;

public class RecyclerViewActivity extends AppCompatActivity {

    List<String> dataList;

    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

//        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);

        //        recyclerView.setLayoutManager(layoutManager);
//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,4);
//
//
//        recyclerView.setLayoutManager(gridLayoutManager);


        StaggeredGridLayoutManager staggeredGridLayoutManager = new
                StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);


        recyclerView.setLayoutManager(staggeredGridLayoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());

//        recyclerView.addItemDecoration();


        dataList = initData();

        recyclerViewAdapter = new RecyclerViewAdapter(this,dataList);

        recyclerView.setAdapter(recyclerViewAdapter);


        Button addButton = (Button) findViewById(R.id.add);

        Button deleteButton = (Button) findViewById(R.id.delete);


        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dataList.add(2,"22222222222222222222222");
                recyclerViewAdapter.notifyItemInserted(2);
            }
        });


        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dataList.remove(3);
                recyclerViewAdapter.notifyItemRemoved(3);
            }
        });



        //取状态值
        if(savedInstanceState != null){
            String testStr = savedInstanceState.getString("string");
            int testInt = savedInstanceState.getInt("int");

            Log.d("RecyclerViewActivity", testStr);

            Log.d("RecyclerViewActivity", "testInt:" + testInt);
        }


    }




    private List<String> initData(){

        List<String> list = new ArrayList<>();
        list.add("testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest");
        list.add("testtesttesttesttesttesttesttest");
        list.add("testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest");
        list.add("testtesttesttesttesttesttesttest");
        list.add("testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest");
        list.add("testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttest");
        list.add("testtesttesttesttesttesttesttest");
        list.add("testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest");
        list.add("testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest");
        list.add("testtesttesttesttesttesttesttest");
        list.add("testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest");
        list.add("testtesttesttesttesttesttesttest");
        list.add("testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest");
        list.add("testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttest");
        list.add("testtesttesttesttesttesttesttest");
        list.add("testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest");

        list.add("testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest");
        list.add("testtesttesttesttesttesttesttest");
        list.add("testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest");
        list.add("testtesttesttesttesttesttesttest");
        list.add("testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest");
        list.add("testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttest");
        list.add("testtesttesttesttesttesttesttest");
        list.add("testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest");


        return list;
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.d("RecyclerViewActivity", "onSaveInstanceState");
        outState.putString("string","测试");
        outState.putInt("int",3);
        super.onSaveInstanceState(outState);

    }


    @Override
    protected void onStop() {
        super.onStop();

        //保存状态到本地
    }

    @Override
    protected void onStart() {
        super.onStart();
        //恢复状态从本地数据
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        //取状态值
        if(savedInstanceState != null){
            String testStr = savedInstanceState.getString("string");
            int testInt = savedInstanceState.getInt("int");

            Log.d("onRestoreInstanceState", testStr);

            Log.d("onRestoreInstanceState", "testInt:" + testInt);
        }
    }
}
