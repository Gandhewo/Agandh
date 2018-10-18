package com.example.user.agandh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private LinkedList<String> resep_nama = new LinkedList<String>();
    private LinkedList<String> resep_detail = new LinkedList<String>();
    private LinkedList<String> resep_ingredients = new LinkedList<String>();
    private LinkedList<String> resep_process = new LinkedList<String>();
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        resep_nama.add("Telur Ceplok");
        resep_detail.add("Telur digoreng tanpa diaduk");
        resep_ingredients.add(" 1. Telur\n 2. Bumbu");
        resep_process.add(" Diproses");
        resep_nama.add("Telur urak arik");
        resep_detail.add("Telur dengan sayuran yang digoreng dan diorak arik");
        resep_ingredients.add(" 1. Telur\n 2. Sayur cincang\n 3. Bumbu");
        resep_process.add(" Diproses");
        resep_nama.add("Kentang goreng");
        resep_detail.add("Kentang yang dipotong panjang panjang dan digoreng");
        resep_ingredients.add(" 1. Kentang\n 2. Bumbu");
        resep_process.add(" Diproses");
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recycleview);
        mAdapter = new WordListAdapter(this,resep_nama,resep_detail,resep_ingredients,resep_process);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
