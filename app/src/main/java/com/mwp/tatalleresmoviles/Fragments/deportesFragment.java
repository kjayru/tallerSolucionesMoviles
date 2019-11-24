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

import com.mwp.tatalleresmoviles.DeporteViewAdapter;
import com.mwp.tatalleresmoviles.Models.Producto;
import com.mwp.tatalleresmoviles.R;


import java.util.ArrayList;
import java.util.List;

/**
 * Fragmento categoria deportes
 */
public class deportesFragment extends Fragment {
    private List<Producto> productoList = new ArrayList<>();
    private DeporteViewAdapter mAdapter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_deportes, container, false);


        final FragmentActivity c = getActivity();

        ///lista reciclery
        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerDeporteView);
        recyclerView.setHasFixedSize(true);

        mAdapter = new DeporteViewAdapter(productoList);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(c);
        recyclerView.setLayoutManager(mLayoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        prepareProductData();


        return rootView;
    }



    private void prepareProductData(){
        Producto producto = new Producto();
        producto.setProducto_id(1);
        producto.setTitulo("Pelota Soccer");
        producto.setImagen("https://falabella.scene7.com/is/image/FalabellaPE/16769892_1");
        producto.setDescripcion("Marca: Nike\n" +
                "Modelo: SC3997-100\n" +
                "Tipo: Pelotas de fútbol\n" +
                "Tamaño: 5\n" +
                "Material princial: Goma\n" +
                "Costura: A máquina\n" +
                "Disciplina: Fútbol");
        producto.setPrice(69.90);
        producto.setStock(10);
        producto.setCategoria("deportes");
        productoList.add(producto);

        Producto producto2 = new Producto();
        producto2.setProducto_id(2);
        producto2.setTitulo("ZAPATILLAS NIKE MUJER AA2182-003 WMNS AIR MAX MOTION RACER 2");
        producto2.setImagen("https://cdnmedia.triathlon.com.pe/media/catalog/product/cache/1/image/1200x/040ec09b1e35df139433887a97daa66f/base/AA2182-003.jpg");
        producto2.setDescripcion("zapatillas nike aa2182-003 wmns air max motion racer 2 urbano mujer");
        producto2.setPrice(300.00);
        producto2.setStock(10);
        producto2.setCategoria("deportes");

        productoList.add(producto2);

        Producto producto3 = new Producto();
        producto3.setProducto_id(3);
        producto3.setTitulo("zapatillas nike ah7363-801 superfly 6 club fg/mg futbol hombre");
        producto3.setImagen("https://falabella.scene7.com/is/image/FalabellaPE/16565453_1");
        producto3.setDescripcion("zapatillas nike ah7363-801 superfly 6 club fg/mg futbol hombre");
        producto3.setPrice(420.00);
        producto3.setStock(10);
        producto3.setCategoria("deportes");

        productoList.add(producto3);


        Producto producto4 = new Producto();
        producto4.setProducto_id(4);
        producto4.setTitulo("GORRO NIKE MUJER 679424-623 FEATHERLIGHT CAP");
        producto4.setImagen("https://cdnmedia.triathlon.com.pe/media/catalog/product/cache/1/image/1200x/040ec09b1e35df139433887a97daa66f/base/679424-623.jpg");
        producto4.setDescripcion("Sea el primero en dejar una reseña\n" +
                "entrenar mujer color rojo (color referencial)\n" +
                "*Imagen Referencia");
        producto4.setPrice(370.00);
        producto4.setStock(10);
        producto4.setCategoria("deportes");


        productoList.add(producto4);


        mAdapter.notifyDataSetChanged();
    }

}
