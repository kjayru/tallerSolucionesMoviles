package com.mwp.tatalleresmoviles.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.mwp.tatalleresmoviles.R;

/**
 * Fragmento de agredecimiento de compra
 */
public class GraciasFragment extends Fragment {

    Button btnRegresar;

    public GraciasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView =  inflater.inflate(R.layout.fragment_gracias, container, false);

        btnRegresar = rootView.findViewById(R.id.btnRegresar);


        btnRegresar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){

                Fragment fragTecnologia = new tecnologiaFragment();

                AppCompatActivity activity = (AppCompatActivity) v.getContext();
                activity.getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.content_frame, fragTecnologia)
                        .addToBackStack(null).commit();

            }
        });


        // Inflate the layout for this fragment

        return rootView;

    }

}
