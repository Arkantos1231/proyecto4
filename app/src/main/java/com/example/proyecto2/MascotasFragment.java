package com.example.proyecto2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyecto2.Mascota;
import com.example.proyecto2.MascotaAdapter;
import com.example.proyecto2.R;

import java.util.ArrayList;

public class MascotasFragment extends Fragment {

    private RecyclerView rvMascotas;
    private ArrayList<Mascota> mascotas;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mascotas, container, false);

        rvMascotas = view.findViewById(R.id.rvMascotas);
        rvMascotas.setLayoutManager(new LinearLayoutManager(getActivity()));

        inicializarMascotas();
        inicializarAdaptador();

        return view;
    }

    private void inicializarMascotas() {
        mascotas = new ArrayList<>();
        mascotas.add(new Mascota("Catty", 5, R.drawable.catty));
        mascotas.add(new Mascota("Doggy", 3, R.drawable.doggy));
        // Agregar más mascotas aquí
    }

    private void inicializarAdaptador() {
        MascotaAdapter adaptador = new MascotaAdapter(mascotas, getActivity());
        rvMascotas.setAdapter(adaptador);
    }
}