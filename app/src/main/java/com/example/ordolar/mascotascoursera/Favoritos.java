package com.example.ordolar.mascotascoursera;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Favoritos extends AppCompatActivity {

    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);
        Toolbar toolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        configureRecyclerView();




    }

    private void configureRecyclerView() {
        //configurar recycler view
        RecyclerView rvf=(RecyclerView) findViewById(R.id.recyclerFavoritos);
        //configurar lista
        rvf=(RecyclerView) findViewById(R.id.recyclerFavoritos);
        List<DataList> list=new ArrayList<>();
        list.add(new DataList("Cachorrito", R.drawable.puppy_1903313_640));
        list.add(new DataList("Cachorro", R.drawable.beach_1790049_640));
        list.add(new DataList("Perro", R.drawable.dog_715545_640));
        list.add(new DataList("Praderas",R.drawable.guinea_pig_242520_640));
        list.add(new DataList("Erizo", R.drawable.hedgehog_468228_640));

        //construir adaptador
        DataListAdapter adapter=new DataListAdapter(this, list);

        //asociar al rv
        rvf.setAdapter(adapter);

        //definir layout
        rvf.setLayoutManager(new LinearLayoutManager(this));
    }


}
