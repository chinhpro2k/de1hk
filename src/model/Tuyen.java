/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author chinh
 */
public class Tuyen implements Serializable{
    private int ma;
    private int kc,soDiemDung;
    public static int sma=100;

    public Tuyen() {
        ma=sma++;
    }

    public Tuyen(int ma, int kc, int soDiemDung) {
        this.ma = ma;
        this.kc = kc;
        this.soDiemDung = soDiemDung;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getKc() {
        return kc;
    }

    public void setKc(int kc) {
        this.kc = kc;
    }

    public int getSoDiemDung() {
        return soDiemDung;
    }

    public void setSoDiemDung(int soDiemDung) {
        this.soDiemDung = soDiemDung;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Tuyen.sma = sma;
    }
     public Object[] toObject(){
         return new Object[]{
           ma,kc,soDiemDung
         };
     }
}
