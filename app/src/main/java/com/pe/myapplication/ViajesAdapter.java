package com.pe.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ViajesAdapter extends RecyclerView.Adapter<ViajesAdapter.MyViewHolder> {
    private List<Viaje> viajeList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvNombre, descripcion;
        public ImageView ivImagen;

        public MyViewHolder(View view) {
            super(view);
            tvNombre = (TextView) view.findViewById(R.id.tvNombre);
            descripcion = (TextView) view.findViewById(R.id.tvDescripcion);
        }
    }

    public ViajesAdapter(List<Viaje> viajeList) {
        this.viajeList = viajeList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_fila, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Viaje viaje = viajeList.get(position);
        holder.tvNombre.setText(viaje.titulo);
        holder.descripcion.setText(viaje.descripcion);
    }

    @Override
    public int getItemCount() {
        return viajeList.size();
    }
}