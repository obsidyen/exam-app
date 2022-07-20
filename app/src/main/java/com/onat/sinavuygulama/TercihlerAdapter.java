package com.onat.sinavuygulama;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TercihlerAdapter extends RecyclerView.Adapter<TercihlerAdapter.TercihKartTutucu> implements Serializable {

    private Context tContext;
    private List<Tercihler> tercihlerListe;
    private List<Favoriler> favorilerListe;

    public TercihlerAdapter(Context tContext, List<Tercihler> tercihlerListe) {
        this.tContext = tContext;
        this.tercihlerListe = tercihlerListe;
    }

    public class TercihKartTutucu extends RecyclerView.ViewHolder{
        private CardView tercih_card;
        private Switch switchTercih;
        private TextView textViewTercih;
        private ImageView imageViewInfoTercih;


        public TercihKartTutucu(View itemView) {
            super(itemView);
            tercih_card = itemView.findViewById(R.id.tercih_card);
            switchTercih = itemView.findViewById(R.id.switchTercih);
            textViewTercih = itemView.findViewById(R.id.textViewTercih);
            imageViewInfoTercih = itemView.findViewById(R.id.imageViewInfoTercih);
        }
    }

    @NonNull
    @Override
    public TercihKartTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.tercihler_card,parent,false);
        return new TercihKartTutucu(itemView);
    }



    @Override
    public void onBindViewHolder(@NonNull final TercihKartTutucu holder, final int position) {
        final Tercihler tercih = tercihlerListe.get(position);
        holder.textViewTercih.setText(tercih.getTercih_ad());

        final SharedPreferences sp = tContext.getSharedPreferences("favoriler",Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sp.edit();



        holder.switchTercih.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                editor.putBoolean("favoriSwitch"+position,isChecked);
                editor.apply();

            }
        });
        favorilerListe = new ArrayList<>();
        Favoriler f = new Favoriler(tercih.getTercih_ad(),tercih.getTercih_id(),tercih.getTercih_resim(),tercih.getTercih_gun()
                ,tercih.getTercih_ay(),tercih.getTercih_yil(),tercih.getTercih_aciklama(),tercih.isTercih_durum());

        if (sp.getBoolean("favoriSwitch"+position,false)){
            holder.switchTercih.setChecked(true);
            //buraya gönderilecekler girilecek
            //yukarıda doldur burdan yolla positiona göre


            favorilerListe.add(f);


        }else{
            holder.switchTercih.setChecked(false);
            favorilerListe.remove(f);
        }

        holder.tercih_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tContext,TercihDetayActivity.class);
                intent.putExtra("tercih",tercih);
                tContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return tercihlerListe.size();
    }
}
