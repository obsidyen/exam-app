package com.onat.sinavuygulama;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FavorilerAdapter extends RecyclerView.Adapter<FavorilerAdapter.FavoriKartTutucu>{

    private Context fContext;
    private List<Favoriler> favorilerListe;

    public FavorilerAdapter(Context fContext, List<Favoriler> favorilerListe) {
        this.fContext = fContext;
        this.favorilerListe = favorilerListe;
    }

    public class FavoriKartTutucu extends RecyclerView.ViewHolder{
        private CardView favori_card;
        private TextView textViewFavori;

        public FavoriKartTutucu(View itemView) {
            super(itemView);
            favori_card = itemView.findViewById(R.id.favori_card);
            textViewFavori = itemView.findViewById(R.id.textViewFavori);
        }
    }

    @NonNull
    @Override
    public FavoriKartTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.favoriler_card,parent,false);
        return new FavoriKartTutucu(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final FavoriKartTutucu holder, int position) {
        final Favoriler favori = favorilerListe.get(position);
        holder.textViewFavori.setText(favori.getFavori_ad());

        holder.favori_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fContext,FavoriDetayActivity.class);
                intent.putExtra("favori",favori);
                fContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return favorilerListe.size();
    }

}
