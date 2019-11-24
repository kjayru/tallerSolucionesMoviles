package com.mwp.tatalleresmoviles.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.mwp.tatalleresmoviles.R;

/**
 * Fragmento donde se muestra el detalle del producto
 */
public class detalleFragment extends Fragment{

    TextView nombreProducto;
    TextView descripcionProd;
    TextView precioProd;
    ImageView canvasProd;
    Button btnComprar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        String nombreProd = getArguments() != null ? getArguments().getString("nombreProd") : "No definido";
        String imagenUrl =  getArguments().getString("imagen");
        String descripcion = getArguments().getString("descripcion");
        String precio = getArguments().getString("precio");


        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_detalle, container, false);

        nombreProducto = root.findViewById(R.id.nombreprod);
        canvasProd = root.findViewById(R.id.fotoproducto);
        descripcionProd = root.findViewById(R.id.descripcion);
        precioProd = root.findViewById(R.id.precio);
        nombreProducto.setText(nombreProd);
        descripcionProd.setText(descripcion);
        precioProd.setText(precio);

        Picasso.get().load(imagenUrl).into(canvasProd);

        btnComprar = root.findViewById(R.id.btnComprar);




        btnComprar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i("info","evento comprar");
                AppCompatActivity activity = (AppCompatActivity) v.getContext();
                Fragment proceso = new ProcesoFragment();

                activity.getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.content_frame, proceso)
                        .addToBackStack(null).commit();
            }
        });

        return root;
    }





}
