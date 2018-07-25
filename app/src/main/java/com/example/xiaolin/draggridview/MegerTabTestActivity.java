package com.example.xiaolin.draggridview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MegerTabTestActivity extends Activity {
    private List<String> strList;
    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meger_tab_test);
//        initData();
//        initView();

    }

    public void initData(){
        strList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            strList.add("Channel " + i);
        }
    }

    private void initView() {
        gridView = (GridView)findViewById(R.id.drag_grid_view);
        GridViewAdapter adapter = new GridViewAdapter(this, strList);
        gridView.setAdapter(adapter);
    }
}
