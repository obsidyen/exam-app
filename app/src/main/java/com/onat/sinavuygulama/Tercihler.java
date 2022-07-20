package com.onat.sinavuygulama;

import java.io.Serializable;

public class Tercihler implements Serializable {

    private String tercih_ad;
    private String tercih_id;
    private String tercih_resim;
    private int tercih_gun;
    private int tercih_ay;
    private int tercih_yil;
    private String tercih_aciklama;
    private boolean tercih_durum;

    public Tercihler() {
    }

    public Tercihler(String tercih_ad, String tercih_id, String tercih_resim, int tercih_gun, int tercih_ay, int tercih_yil, String tercih_aciklama, boolean tercih_durum) {
        this.tercih_ad = tercih_ad;
        this.tercih_id = tercih_id;
        this.tercih_resim = tercih_resim;
        this.tercih_gun = tercih_gun;
        this.tercih_ay = tercih_ay;
        this.tercih_yil = tercih_yil;
        this.tercih_aciklama = tercih_aciklama;
        this.tercih_durum = tercih_durum;
    }

    public String getTercih_ad() {
        return tercih_ad;
    }

    public void setTercih_ad(String tercih_ad) {
        this.tercih_ad = tercih_ad;
    }

    public String getTercih_id() {
        return tercih_id;
    }

    public void setTercih_id(String tercih_id) {
        this.tercih_id = tercih_id;
    }

    public String getTercih_resim() {
        return tercih_resim;
    }

    public void setTercih_resim(String tercih_resim) {
        this.tercih_resim = tercih_resim;
    }

    public int getTercih_gun() {
        return tercih_gun;
    }

    public void setTercih_gun(int tercih_gun) {
        this.tercih_gun = tercih_gun;
    }

    public int getTercih_ay() {
        return tercih_ay;
    }

    public void setTercih_ay(int tercih_ay) {
        this.tercih_ay = tercih_ay;
    }

    public int getTercih_yil() {
        return tercih_yil;
    }

    public void setTercih_yil(int tercih_yil) {
        this.tercih_yil = tercih_yil;
    }

    public String getTercih_aciklama() {
        return tercih_aciklama;
    }

    public void setTercih_aciklama(String tercih_aciklama) {
        this.tercih_aciklama = tercih_aciklama;
    }

    public boolean isTercih_durum() {
        return tercih_durum;
    }

    public void setTercih_durum(boolean tercih_durum) {
        this.tercih_durum = tercih_durum;
    }
}
