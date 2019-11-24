package com.mwp.tatalleresmoviles.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mwp.tatalleresmoviles.JuegoViewAdapter;
import com.mwp.tatalleresmoviles.Models.Producto;
import com.mwp.tatalleresmoviles.R;


import java.util.ArrayList;
import java.util.List;

/**
 * Fragmento categoria juegos
 */
public class juegosFragment extends Fragment {

    private List<Producto> productoList = new ArrayList<>();
    private JuegoViewAdapter mAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflamos layout
        View rootView =  inflater.inflate(R.layout.fragment_juegos, container, false);
        final FragmentActivity c = getActivity();

        ///listado
        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerJuegoView);
        recyclerView.setHasFixedSize(true);

        mAdapter = new JuegoViewAdapter(productoList);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(c);
        recyclerView.setLayoutManager(mLayoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        prepareProductData();

        return rootView;
    }

    /**
     * Agregamos productos mendiante el modelo
     */
    private void prepareProductData(){
        Producto producto = new Producto();
        producto.setProducto_id(1);
        producto.setTitulo("Videojuego PS4 Dragon Ball Fighter Z");
        producto.setImagen("https://falabella.scene7.com/is/image/FalabellaPE/15875021_1");
        producto.setDescripcion("Gran Turismo Sport es la nueva entrega de la afamada serie de títulos de conducción y simulación para PlayStation 4. Polyphony Digital ha mantenido la jugabilidad clásica de la saga, ofreciendo más de un centenar de nuevos vehículos, una treintena de circuitos y pistas, recorridos de rally y un apartado gráfico renovado.");
        producto.setPrice(239.00);
        producto.setStock(10);
        producto.setCategoria("juegos");
        productoList.add(producto);

        Producto producto2 = new Producto();
        producto2.setProducto_id(2);
        producto2.setTitulo("Videojuego para PS4 Gran Turismo Sport Latam");
        producto2.setImagen("https://falabella.scene7.com/is/image/FalabellaPE/16029962_1");
        producto2.setDescripcion("Gran Turismo Sport es la nueva entrega de la afamada serie de títulos de conducción y simulación para PlayStation 4. Polyphony Digital ha mantenido la jugabilidad clásica de la saga, ofreciendo más de un centenar de nuevos vehículos, una treintena de circuitos y pistas, recorridos de rally y un apartado gráfico renovado.");
        producto2.setPrice(239.00);
        producto2.setStock(10);
        producto2.setCategoria("juegos");

        productoList.add(producto2);

        Producto producto3 = new Producto();
        producto3.setProducto_id(3);
        producto3.setTitulo("Consola de PS4 Pro 1TB Negro");
        producto3.setImagen("https://falabella.scene7.com/is/image/FalabellaPE/16029965_1");
        producto3.setDescripcion("Sony trae su célebra y más moderna consola en su versión remasterizada con el increíble PlayStation 4 PRO. Ésta poderosa consola emula juegos en 4K y mejora los gráficos ampliamente.");
        producto3.setPrice(2229.00);
        producto3.setStock(10);
        producto3.setCategoria("juegos");

        productoList.add(producto3);


        Producto producto4 = new Producto();
        producto4.setProducto_id(3);
        producto4.setTitulo("Combo: PS4 SLIM 1TB + Pro Evolution 2020 PS4 + Control PS4 Negro");
        producto4.setImagen("https://falabella.scene7.com/is/image/FalabellaPE/sku11670013_1");
        producto4.setDescripcion("El control DUALSHOCK4 trae nuevas innovaciones para entregar una experiencia de juego más inmersiva, incluyendo un sensor de seis ejes hiper-sensible así como un panel táctil localizado encima del control, el cual ofrece formas completamente nuevas de jugar e interactuar con los juegos. El nuevo botón COMPARTIR (SHARE) hace muy fácil la transmisión y capacidad de compartir video. Las mejoras ergonómicas hacen que sea más cómodo sostener el control, mientras que la optimización de las palancas y botones análogos se traducen en un control más preciso.");
        producto4.setPrice(1299.00);
        producto4.setStock(10);
        producto4.setCategoria("juegos");

        productoList.add(producto4);


        mAdapter.notifyDataSetChanged();
    }
}
