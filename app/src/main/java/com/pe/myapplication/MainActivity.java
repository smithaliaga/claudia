package com.pe.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ViajesAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        preparePeliculaData();
    }

    public void preparePeliculaData(){
        List<Viaje> viajeList = new ArrayList<>();
        Viaje viaje = new Viaje();
        viaje.titulo = "Viaje Realizado el 01/01/2019";
        viaje.descripcion = "El distancia del viaje fue de 5 km y duro 45 min.";
        viajeList.add(viaje);

        viaje = new Viaje();
        viaje.titulo = "Viaje Realizado el 02/01/2019";
        viaje.descripcion = "El distancia del viaje fue de 10 km y duro 25 min.";
        viajeList.add(viaje);

        viaje = new Viaje();
        viaje.titulo = "Viaje Realizado el 03/01/2019";
        viaje.descripcion = "El distancia del viaje fue de 15 km y duro 30 min.";
        viajeList.add(viaje);

        mAdapter = new ViajesAdapter(viajeList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(mAdapter);
    }
}
