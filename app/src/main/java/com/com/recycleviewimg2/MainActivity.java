package com.com.recycleviewimg2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private MainActivity mContext = this;
    private RecyclerView rvlist;
    private RecyclerView.LayoutManager layoutManager;
    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init();
        initAdapter();
        initData();

    }

    public void init(){
     rvlist = findViewById(R.id.rvlist);

    }
    public void initAdapter(){
      layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
      rvlist.setLayoutManager(layoutManager);
      adapter = new Adapter(mContext);
      rvlist.setAdapter(adapter);

    }
    public void initData(){
        Provider p = new Provider();
        adapter.additems(p.findAll());
    }
}