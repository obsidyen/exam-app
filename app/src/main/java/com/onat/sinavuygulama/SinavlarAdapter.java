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

import java.util.List;

public class SinavlarAdapter extends RecyclerView.Adapter<SinavlarAdapter.SinavKartTutucu> {

    private Context mContext;
    private List<Sinavlar> sinavlarListe;

    public SinavlarAdapter(Context mContext, List<Sinavlar> sinavlarListe) {
        this.mContext = mContext;
        this.sinavlarListe = sinavlarListe;
    }

    public class SinavKartTutucu extends RecyclerView.ViewHolder{
        private CardView sinav_card;
        private Switch switchSinav;
        private TextView textViewSinav;
        private ImageView imageViewInfoSinav;

        public SinavKartTutucu(View itemView) {
            super(itemView);
            sinav_card = itemView.findViewById(R.id.sinav_card);
            switchSinav = itemView.findViewById(R.id.switchSinav);
            textViewSinav = itemView.findViewById(R.id.textViewSinav);
            imageViewInfoSinav = itemView.findViewById(R.id.imageViewInfoSinav);

        }
    }

    @NonNull
    @Override
    public SinavKartTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.sinavlar_card,parent,false);
        return new SinavKartTutucu(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SinavKartTutucu holder, final int position) {
        final Sinavlar sinav = sinavlarListe.get(position);
        holder.textViewSinav.setText(sinav.getSinav_ad());

        final SharedPreferences sp = mContext.getSharedPreferences("favoriler",Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sp.edit();



        holder.switchSinav.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                editor.putBoolean("favoriSwitch"+position,isChecked);
                editor.apply();
            }
        });


        if (sp.getBoolean("favoriSwitch"+position,false)){
            holder.switchSinav.setChecked(true);

        }else{
            holder.switchSinav.setChecked(false);

        }

        holder.sinav_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,SinavlarDetayActivity.class);
                intent.putExtra("sinav",sinav);
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return sinavlarListe.size();
    }
}
