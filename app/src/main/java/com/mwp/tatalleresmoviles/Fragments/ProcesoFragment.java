package com.mwp.tatalleresmoviles.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.mwp.tatalleresmoviles.R;

/**
 * proceso de pago simulado con tarjeta
 */
public class ProcesoFragment extends Fragment {
    Button btnGracias;

    public ProcesoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup root = (ViewGroup)  inflater.inflate(R.layout.fragment_proceso, container, false);
        btnGracias = root.findViewById(R.id.btnGracias);

        btnGracias.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AppCompatActivity activity = (AppCompatActivity) v.getContext();
                Fragment gracias = new GraciasFragment();

                activity.getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.content_frame, gracias)
                        .addToBackStack(null).commit();
            }
        });

        return root;
    }

}
