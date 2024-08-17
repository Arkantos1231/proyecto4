package com.example.proyecto2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyecto2.Mascota;
import com.example.proyecto2.MascotaAdapter;
import com.example.proyecto2.R;

import java.util.ArrayList;

public class PerfilFragment extends Fragment {

    private RecyclerView rvFotosMascota;
    private ArrayList<Mascota> fotosMascota;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_perfil, container, false);

        rvFotosMascota = view.findViewById(R.id.rvFotosMascota);
        rvFotosMascota.setLayoutManager(new GridLayoutManager(getActivity(), 3));

        inicializarFotosMascota();
        inicializarAdaptador();

        return view;
    }

    private void inicializarFotosMascota() {
        fotosMascota = new ArrayList<>();
        fotosMascota.add(new Mascota("Ronny", 5, R.drawable.doggy));
        fotosMascota.add(new Mascota("Ronny", 3, R.drawable.doggy));
        fotosMascota.add(new Mascota("Ronny", 2, R.drawable.doggy));
        // Agregar más fotos aquí
    }

    private void inicializarAdaptador() {
        MascotaAdapter adaptador = new MascotaAdapter(fotosMascota, getActivity());
        rvFotosMascota.setAdapter(adaptador);
    }
}