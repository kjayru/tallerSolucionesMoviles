package com.mwp.tatalleresmoviles.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.mwp.tatalleresmoviles.R;

import com.mwp.tatalleresmoviles.Models.Producto;

import com.mwp.tatalleresmoviles.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Fragmento categoria tecnologia
 */
public class tecnologiaFragment extends Fragment{
    private List<Producto> productoList = new ArrayList<>();
    private RecyclerViewAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_tecnologia, container, false);
        final FragmentActivity c = getActivity();
        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        mAdapter = new RecyclerViewAdapter(productoList);

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
        producto.setTitulo("Portátil HP 14-dk0011ns, AMD Ryzen 5, 8 GB, 512 GB SSD, Radeon Vega 8");
        producto.setImagen("https://sgfm.elcorteingles.es/SGFM/dctm/MEDIA03/201907/18/00115215571058____6__640x640.jpg");
        producto.setDescripcion("Diseñado para una máxima portabilidad, este portátil ligero dispone de una pantalla de microbordes con bisel ultrafino que ofrece un área máxima de imagen con un marco más pequeño.");
        producto.setPrice(1200.00);
        producto.setStock(10);
        producto.setCategoria("tecnologia");
        productoList.add(producto);

        Producto producto2 = new Producto();
        producto2.setProducto_id(2);
        producto2.setTitulo("Nuevo iPad 2019 Wi-Fi 32 GB Oro");
        producto2.setImagen("https://sgfm.elcorteingles.es/SGFM/dctm/MEDIA03/201909/12/00115217007705____1__640x640.jpg");
        producto2.setDescripcion("El nuevo iPad combina el rendimiento y las posibilidades de un ordenador con la versatilidad y facilidad de uso que solo tienen los iPad. Pero ahí no queda la cosa, ahora vas a disfrutar" +
                " como nunca gracias a su pantalla Retina más grande de 10,2 pulgadas, la compatibilidad con el Smart Keyboard y las alucinantes prestaciones del nuevo iPadOS. ");
        producto2.setPrice(300.00);
        producto2.setStock(10);
        producto2.setCategoria("tecnologia");
        productoList.add(producto2);

        Producto producto3 = new Producto();
        producto3.setProducto_id(3);
        producto3.setTitulo("Convertible Lenovo Yoga 530-14 81EK00FWSP, i3, 8 GB, 256 GB SSD");
        producto3.setImagen("https://sgfm.elcorteingles.es/SGFM/dctm/MEDIA03/201911/05/00115214802884____9__640x640.jpg");
        producto3.setDescripcion("Portátil Lenovo 2 en 1 Yoga 530-14. Procesador Intel Core i3-7020U, 8 GB RAM. Disco duro de 256GB SSD, pantalla táctil de 14\" HD, Windows 10 Home:\n" +
                "Desata tu creatividad. Conoce el Yoga 530, un portátil 2 en 1 con estilo y compacto, con funciones que aprovecharás al máximo para tu entretenimiento y creatividad: procesamiento Intel Core, claridad visual y de sonido impresionantes para todas tus necesidades multimedia.");
        producto3.setPrice(350.00);
        producto3.setStock(10);
        producto3.setCategoria("tecnologia");
        productoList.add(producto3);


        Producto producto4 = new Producto();
        producto4.setProducto_id(4);
        producto4.setTitulo("Impresora Láser HP LaserJet Pro M15w, Wi-Fi, ePrint, AirPrint, Google Cloud Print");
        producto4.setImagen("https://sgfm.elcorteingles.es/SGFM/dctm/MEDIA03/201805/30/00128615800365____1__640x640.jpg");
        producto4.setDescripcion("Obtenga una impresión rápida que se adapta a su espacio y presupuesto. Produzca resultados de calidad profesional, e imprima y escanee desde su móvil:\n" +
                "Impresora con seguridad dinámica habilitada. Para ser exclusivamente utilizada con cartuchos que utilicen un chip original de HP. Es posible que no funcionen los cartuchos que no utilicen un chip de HP, y que los que funcionan hoy no funcionen en el futuro.");
        producto4.setPrice(1200.00);
        producto4.setStock(10);
        producto4.setCategoria("tecnologia");
        productoList.add(producto4);


        mAdapter.notifyDataSetChanged();
    }

}
