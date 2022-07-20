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

public class BasvurularAdapter extends RecyclerView.Adapter<BasvurularAdapter.BasvuruKartTutucu>{

    private Context mContext;
    private List<Basvurular> basvurularListe;

    public BasvurularAdapter(Context mContext, List<Basvurular> basvurularListe) {
        this.mContext = mContext;
        this.basvurularListe = basvurularListe;
    }

    public class BasvuruKartTutucu extends RecyclerView.ViewHolder{
        private CardView basvuru_card;
        private Switch switchBasvuru;
        private TextView textViewBasvuru;
        private ImageView imageViewInfo;

        public BasvuruKartTutucu(View itemView) {
            super(itemView);
            basvuru_card = itemView.findViewById(R.id.basvuru_card);
            switchBasvuru = itemView.findViewById(R.id.switchBasvuru);
            textViewBasvuru = itemView.findViewById(R.id.textViewBasvuru);
            imageViewInfo = itemView.findViewById(R.id.imageViewInfoSinav);

        }
    }

    @NonNull
    @Override
    public BasvuruKartTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.basvurular_card,parent,false);
        return new BasvuruKartTutucu(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull BasvuruKartTutucu holder, final int position) {
        final Basvurular basvurular = basvurularListe.get(position);
        holder.textViewBasvuru.setText(basvurular.getBasvuru_ad());

        final SharedPreferences sp = mContext.getSharedPreferences("favoriler",Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sp.edit();



        holder.switchBasvuru.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                editor.putBoolean("favoriSwitch"+position,isChecked);
                editor.apply();
            }
        });


        if (sp.getBoolean("favoriSwitch"+position,false)){
            holder.switchBasvuru.setChecked(true);


        }else{
            holder.switchBasvuru.setChecked(false);

        }

        holder.basvuru_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,BasvurularDetayActivity.class);
                intent.putExtra("basvuru",basvurular);
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return basvurularListe.size();
    }
}
