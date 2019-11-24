package com.mwp.tatalleresmoviles;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mwp.tatalleresmoviles.Fragments.detalleFragment;
import com.mwp.tatalleresmoviles.Models.Producto;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Reciclador para categoria juegos
 */
public class JuegoViewAdapter extends RecyclerView.Adapter<JuegoViewAdapter.ViewHolder> {

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        ImageView imagen;
        TextView descripcion;
        TextView precioprod;

        ViewHolder(View view) {
            super(view);
            name = view.findViewById(R.id.nameProducto);
            imagen = view.findViewById(R.id.imageProducto);
            descripcion = view.findViewById(R.id.descripcion);
            precioprod = view.findViewById(R.id.listprecio);

        }
    }
    private List<Producto> lstProducto = new ArrayList<>();
    private Context mContext;

    public JuegoViewAdapter(List<Producto> lstProducto) {

        this.lstProducto = lstProducto;
        this.mContext = mContext;

    }

    @Override
    public JuegoViewAdapter.ViewHolder onCreateViewHolder (ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem, parent, false);
        return  new JuegoViewAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(JuegoViewAdapter.ViewHolder holder, final int position) {


        Producto  producto = lstProducto.get(position);

        final String nombreProd = producto.getTitulo();
        final String descripcion = producto.getDescripcion();
        final String imageUrl = producto.getImagen();
        final Double price = producto.getPrice();

        holder.name.setText(producto.getTitulo());
        Picasso.get().load(imageUrl).into(holder.imagen);

        String preciofin = "S/"+String.valueOf(price);
        holder.precioprod.setText(preciofin);


        holder.imagen.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){


                Bundle args = new Bundle();
                args.putString("nombreProd", nombreProd);
                args.putString("descripcion",descripcion);
                args.putString("imagen", imageUrl);
                args.putString("precio",String.valueOf(price));


                AppCompatActivity activity = (AppCompatActivity) view.getContext();
                Fragment fragdetalle = new detalleFragment();

                fragdetalle.setArguments(args);

                activity.getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.content_frame, fragdetalle)
                        .addToBackStack(null).commit();


            }
        });
    }

    @Override
    public int getItemCount() {
        return lstProducto.size();
    }
}
