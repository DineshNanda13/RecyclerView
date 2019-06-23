package com.meterstoinches.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import Adapter.MyAdapter;
import Model.ListItem;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true); //everything is aligned properly (each iten has fixed size)
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();

        //ListItem item1 = new ListItem("Movie 1","it's about someone crazy...","5.5");
        //ListItem item2 = new ListItem("Movie 2","it's about someone emotional...","7.5");

       for(int i=0; i<10;i++){
            ListItem item = new ListItem("Item "+ (i+1),"Description ","Great ");
            listItems.add(item);
        }
       // listItems.add(item1);
        // listItems.add(item2);
        adapter = new MyAdapter(this,listItems);
        recyclerView.setAdapter(adapter);
    }
}
