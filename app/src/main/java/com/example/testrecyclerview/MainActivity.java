package com.example.testrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private MonRecyclerViewAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new MonRecyclerViewAdapter(getDataSource());
        mRecyclerView.setAdapter(mAdapter);
    }

    private ArrayList<Donnee> getDataSource() {
        ArrayList results = new ArrayList<Donnee>();
        for (int index = 0; index < 20; index++) {
            Donnee obj = new Donnee("Texte principal " + index,"Texte auxiliaire " + index);
            results.add(index, obj);
        }
        return results;
    }
}

