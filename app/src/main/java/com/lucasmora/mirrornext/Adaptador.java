package com.lucasmora.mirrornext;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolderA> {
    private int[] imagens;
    private String[] textos;

    public static class ViewHolderA extends RecyclerView.ViewHolder {
        public ImageView imgRecycler;
        public TextView txtRecycler;

        public ViewHolderA(View v) {
            super(v);
            imgRecycler = (ImageView) v.findViewById(R.id.img_recycler_atalhos);
            txtRecycler = (TextView) v.findViewById(R.id.texto_recycler_atalhos);
        }
    }

    public Adaptador(int[] i, String[] d) {
        imagens = i;
        textos = d;
    }

    @NonNull
    @Override
    public ViewHolderA onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lista_atalhos, parent, false);
        ViewHolderA vh = new ViewHolderA(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderA holder, int position) {
        holder.imgRecycler.setImageResource(imagens[position]);
        holder.txtRecycler.setText(textos[position]);
    }

    @Override
    public int getItemCount() {
        return textos.length;
    }
}
