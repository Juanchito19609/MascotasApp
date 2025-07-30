package com.example.mascotas;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Mascota> mascotas;
    RecyclerView rvMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMascotas = findViewById(R.id.rvMascotas);
        rvMascotas.setLayoutManager(new LinearLayoutManager(this));

        inicializarLista();
        MascotaAdapter adapter = new MascotaAdapter(mascotas);
        rvMascotas.setAdapter(adapter);
    }

    public void inicializarLista() {
        mascotas = new ArrayList<>();
        mascotas.add(new Mascota(R.drawable.perro1, "Rex", 0));
        mascotas.add(new Mascota(R.drawable.perro2, "Bobby", 0));
        mascotas.add(new Mascota(R.drawable.perro3, "Luna", 0));
        mascotas.add(new Mascota(R.drawable.perro4, "Max", 0));
        mascotas.add(new Mascota(R.drawable.perro5, "Rocky", 0));
    }
}
