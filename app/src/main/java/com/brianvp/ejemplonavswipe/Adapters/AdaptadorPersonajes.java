package com.brianvp.ejemplonavswipe.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.brianvp.ejemplonavswipe.Clases.Personaje;
import com.brianvp.ejemplonavswipe.R;

import java.util.ArrayList;

/**
 * Created by IBVP on 05/11/2018.
 */

public class AdaptadorPersonajes extends RecyclerView.Adapter<AdaptadorPersonajes.ViewHolderPersonajes> {
    ArrayList<Personaje> lPersonaje;

    public AdaptadorPersonajes(ArrayList<Personaje> lPersonaje){
        this.lPersonaje = lPersonaje;
    }

    @Override
    public AdaptadorPersonajes.ViewHolderPersonajes onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemspersonajes,null,false);
        return new ViewHolderPersonajes(view);
    }

    @Override
    public void onBindViewHolder(AdaptadorPersonajes.ViewHolderPersonajes holder, int position) {
        holder.nombreP.setText(lPersonaje.get(position).getNombre());
        holder.descP.setText(lPersonaje.get(position).getDescripcion());
        holder.foto.setImageResource(lPersonaje.get(position).getFoto());

    }

    @Override
    public int getItemCount() {
        return lPersonaje.size();
    }

    public class ViewHolderPersonajes extends RecyclerView.ViewHolder {
        TextView nombreP,descP;
        ImageView foto;
        public ViewHolderPersonajes(View itemView) {
            super(itemView);
            nombreP = itemView.findViewById(R.id.nPersonaje);
            descP = itemView.findViewById(R.id.dPersonaje);
            foto = itemView.findViewById(R.id.fotoPersonaje);

        }
    }
}
