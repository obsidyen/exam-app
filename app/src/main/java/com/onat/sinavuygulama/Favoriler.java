package com.onat.sinavuygulama;

import java.io.Serializable;

public class Favoriler implements Serializable {

    private String favori_ad;
    private String favori_id;
    private String favori_resim;
    private int favori_gun;
    private int favori_ay;
    private int favori_yil;
    private String favori_aciklama;
    private boolean favori_durum;

    public Favoriler() {
    }

    public Favoriler(String favori_ad, String favori_id, String favori_resim, int favori_gun, int favori_ay, int favori_yil, String favori_aciklama, boolean favori_durum) {
        this.favori_ad = favori_ad;
        this.favori_id = favori_id;
        this.favori_resim = favori_resim;
        this.favori_gun = favori_gun;
        this.favori_ay = favori_ay;
        this.favori_yil = favori_yil;
        this.favori_aciklama = favori_aciklama;
        this.favori_durum = favori_durum;
    }

    public String getFavori_ad() {
        return favori_ad;
    }

    public void setFavori_ad(String favori_ad) {
        this.favori_ad = favori_ad;
    }

    public String getFavori_id() {
        return favori_id;
    }

    public void setFavori_id(String favori_id) {
        this.favori_id = favori_id;
    }

    public String getFavori_resim() {
        return favori_resim;
    }

    public void setFavori_resim(String favori_resim) {
        this.favori_resim = favori_resim;
    }

    public int getFavori_gun() {
        return favori_gun;
    }

    public void setFavori_gun(int favori_gun) {
        this.favori_gun = favori_gun;
    }

    public int getFavori_ay() {
        return favori_ay;
    }

    public void setFavori_ay(int favori_ay) {
        this.favori_ay = favori_ay;
    }

    public int getFavori_yil() {
        return favori_yil;
    }

    public void setFavori_yil(int favori_yil) {
        this.favori_yil = favori_yil;
    }

    public String getFavori_aciklama() {
        return favori_aciklama;
    }

    public void setFavori_aciklama(String favori_aciklama) {
        this.favori_aciklama = favori_aciklama;
    }

    public boolean isFavori_durum() {
        return favori_durum;
    }

    public void setFavori_durum(boolean favori_durum) {
        this.favori_durum = favori_durum;
    }
}
