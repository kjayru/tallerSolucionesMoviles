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

import com.mwp.tatalleresmoviles.ElectroViewAdapter;
import com.mwp.tatalleresmoviles.Models.Producto;
import com.mwp.tatalleresmoviles.R;


import java.util.ArrayList;
import java.util.List;

/**
 * Fragmento de categoria electro
 */
public class electroFragment extends Fragment {
    private List<Producto> productoList = new ArrayList<>();
    private ElectroViewAdapter mAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_electro, container, false);


        final FragmentActivity c = getActivity();

        ///lista reciclery
        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerElectroView);
        recyclerView.setHasFixedSize(true);

        mAdapter = new ElectroViewAdapter(productoList);

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
        producto.setTitulo("Frigobar Retro 125 Lts Rojo");
        producto.setImagen("https://falabella.scene7.com/is/image/FalabellaPE/16705605_1");
        producto.setDescripcion("Disfruta cuando quieras las más refrescantes bebidas con Continental. Con una capacidad de hasta 125 Lts y compartimientos estratégicos podrás tener a la mano una variedad de refrescos, frutas y alimentos a temperatura ideal. Finos acabados acompañan a una resistente superficie que garantizarán un mejor funcionamiento del Frigobar Retro ¡No esperes más y adquiere esta sensacional presentación que Saga Falabella tiene para ti!");
        producto.setPrice(438.00);
        producto.setStock(10);
        producto.setCategoria("electro");
        productoList.add(producto);

        Producto producto2 = new Producto();
        producto2.setProducto_id(2);
        producto2.setTitulo("Ventilador Portátil ANEMO Negro");
        producto2.setImagen("https://falabella.scene7.com/is/image/FalabellaPE/15933560");
        producto2.setDescripcion("Ahora podrás mantener las distintas áreas de tu casa bien ventiladas con este potente ventilador portátil que la reconocida marca Taurus tiene para ti. Con sus 3 velocidades y una potencia de 150 W, este ventilador te será muy útil en las temporadas donde el calor se vuelve insoportable. Además, sus 6 aspas harán que te llegue mayor cantidad de aire. ¡Olvídate del calor con este ventilador de Taurus!");
        producto2.setPrice(150.00);
        producto2.setStock(10);
        producto2.setCategoria("electro");

        productoList.add(producto2);

        Producto producto3 = new Producto();
        producto3.setProducto_id(3);
        producto3.setTitulo("Smarthome Security Kit");
        producto3.setImagen("https://falabella.scene7.com/is/image/FalabellaPE/15805951_1");
        producto3.setDescripcion("Este kit de seguridad le permite, de un modo muy sencillo, comenzar una red de domótica en su casa y convertirla así en un hogar inteligente, sin necesidad de llamar a ningún instalador. Sin ningún tipo de cuotas, ni contratos y controlando absolutamente todo desde una sóla aplicacion de su Smartphone. Sepa en todo momento lo que ocurre en su casa.");
        producto3.setPrice(350.00);
        producto3.setStock(10);
        producto3.setCategoria("electro");

        productoList.add(producto3);


        Producto producto4 = new Producto();
        producto4.setProducto_id(4);
        producto4.setTitulo("Aire Acondicionado Portátil 9,000 BTU");
        producto4.setImagen("https://falabella.scene7.com/is/image/FalabellaPE/881042616_1");
        producto4.setDescripcion("No permitas que el verano te incomode, usa este aire acondicionado dentro de tu casa o la oficina y mantente siempre fresco.");
        producto4.setPrice(779.00);
        producto4.setStock(10);
        producto4.setCategoria("electro");

        productoList.add(producto4);


        mAdapter.notifyDataSetChanged();
    }

}
