package com.example.ordolar.mascotascoursera;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageButton huesobtn;

    TextView detailsTV;

    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        configureRecyclerView();
        huesobtn=(ImageButton) findViewById(R.id.huesobtn);
        detailsTV= (TextView) findViewById(R.id.detailsTV);


    }

    public void likes(View v){
        contador++;
        String cont=String.valueOf(contador);
        detailsTV.setText("Likes: "+cont);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //inflamos menú
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    //respuesta
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //hacemos un switch sobre item
        switch (item.getItemId()){
            case R.id.favoritos:
                Intent intent=new Intent(this,Favoritos.class);
                startActivity(intent);
                Toast.makeText(this,"Favoritos",Toast.LENGTH_LONG).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    private void configureRecyclerView() {
        //configurar recycler view
        RecyclerView rv=(RecyclerView) findViewById(R.id.recyclerView);
        //configurar lista
        List<DataList> list=new ArrayList<>();
        list.add(new DataList("Papagayo", R.drawable.animal_1853275_640));
        list.add(new DataList("Cachorro", R.drawable.beach_1790049_640));
        list.add(new DataList("Perro", R.drawable.dog_715545_640));
        list.add(new DataList("Praderas",R.drawable.guinea_pig_242520_640));
        list.add(new DataList("Erizo", R.drawable.hedgehog_468228_640));
        list.add(new DataList("Pez", R.drawable.pets_1922070_640));
        list.add(new DataList("Cachorrito", R.drawable.puppy_1903313_640));


        //construir adaptador
        DataListAdapter adapter=new DataListAdapter(this, list);

        //asociar al rv
        rv.setAdapter(adapter);

        //definir layout
        rv.setLayoutManager(new LinearLayoutManager(this));
    }




}
