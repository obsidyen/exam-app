package com.onat.sinavuygulama;

import java.io.Serializable;

public class Sinavlar implements Serializable {

    private String sinav_ad;
    private String sinav_id;
    private String sinav_resim;
    private int sinav_gun;
    private int sinav_ay;
    private int sinav_yil;
    private String sinav_aciklama;
    private boolean sinav_durum;

    public Sinavlar() {
    }

    public Sinavlar(String sinav_ad, String sinav_id, String sinav_resim, int sinav_gun, int sinav_ay, int sinav_yil, String sinav_aciklama, boolean sinav_durum) {
        this.sinav_ad = sinav_ad;
        this.sinav_id = sinav_id;
        this.sinav_resim = sinav_resim;
        this.sinav_gun = sinav_gun;
        this.sinav_ay = sinav_ay;
        this.sinav_yil = sinav_yil;
        this.sinav_aciklama = sinav_aciklama;
        this.sinav_durum = sinav_durum;
    }

    public String getSinav_ad() {
        return sinav_ad;
    }

    public void setSinav_ad(String sinav_ad) {
        this.sinav_ad = sinav_ad;
    }

    public String getSinav_id() {
        return sinav_id;
    }

    public void setSinav_id(String sinav_id) {
        this.sinav_id = sinav_id;
    }

    public String getSinav_resim() {
        return sinav_resim;
    }

    public void setSinav_resim(String sinav_resim) {
        this.sinav_resim = sinav_resim;
    }

    public int getSinav_gun() {
        return sinav_gun;
    }

    public void setSinav_gun(int sinav_gun) {
        this.sinav_gun = sinav_gun;
    }

    public int getSinav_ay() {
        return sinav_ay;
    }

    public void setSinav_ay(int sinav_ay) {
        this.sinav_ay = sinav_ay;
    }

    public int getSinav_yil() {
        return sinav_yil;
    }

    public void setSinav_yil(int sinav_yil) {
        this.sinav_yil = sinav_yil;
    }

    public String getSinav_aciklama() {
        return sinav_aciklama;
    }

    public void setSinav_aciklama(String sinav_aciklama) {
        this.sinav_aciklama = sinav_aciklama;
    }

    public boolean isSinav_durum() {
        return sinav_durum;
    }

    public void setSinav_durum(boolean sinav_durum) {
        this.sinav_durum = sinav_durum;
    }
}
