package com.onat.sinavuygulama;

import java.io.Serializable;

public class Basvurular implements Serializable {

    private String basvuru_ad;
    private String basvuru_id;
    private String basvuru_resim;
    private int basvuru_gun;
    private int basvuru_ay;
    private int basvuru_yil;
    private String basvuru_aciklama;
    private boolean basvuru_durum;

    public Basvurular() {
    }

    public Basvurular(String basvuru_ad, String basvuru_id, String basvuru_resim, int basvuru_gun, int basvuru_ay, int basvuru_yil, String basvuru_aciklama, boolean basvuru_durum) {
        this.basvuru_ad = basvuru_ad;
        this.basvuru_id = basvuru_id;
        this.basvuru_resim = basvuru_resim;
        this.basvuru_gun = basvuru_gun;
        this.basvuru_ay = basvuru_ay;
        this.basvuru_yil = basvuru_yil;
        this.basvuru_aciklama = basvuru_aciklama;
        this.basvuru_durum = basvuru_durum;
    }

    public String getBasvuru_ad() {
        return basvuru_ad;
    }

    public void setBasvuru_ad(String basvuru_ad) {
        this.basvuru_ad = basvuru_ad;
    }

    public String getBasvuru_id() {
        return basvuru_id;
    }

    public void setBasvuru_id(String basvuru_id) {
        this.basvuru_id = basvuru_id;
    }

    public String getBasvuru_resim() {
        return basvuru_resim;
    }

    public void setBasvuru_resim(String basvuru_resim) {
        this.basvuru_resim = basvuru_resim;
    }

    public int getBasvuru_gun() {
        return basvuru_gun;
    }

    public void setBasvuru_gun(int basvuru_gun) {
        this.basvuru_gun = basvuru_gun;
    }

    public int getBasvuru_ay() {
        return basvuru_ay;
    }

    public void setBasvuru_ay(int basvuru_ay) {
        this.basvuru_ay = basvuru_ay;
    }

    public int getBasvuru_yil() {
        return basvuru_yil;
    }

    public void setBasvuru_yil(int basvuru_yil) {
        this.basvuru_yil = basvuru_yil;
    }

    public String getBasvuru_aciklama() {
        return basvuru_aciklama;
    }

    public void setBasvuru_aciklama(String basvuru_aciklama) {
        this.basvuru_aciklama = basvuru_aciklama;
    }

    public boolean isBasvuru_durum() {
        return basvuru_durum;
    }

    public void setBasvuru_durum(boolean basvuru_durum) {
        this.basvuru_durum = basvuru_durum;
    }
}
