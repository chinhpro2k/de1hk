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
public class Laixe implements Serializable{
    //ma lx, ho ten ,dia chi ,trinh do
    private int ma;
    private String ten,dc;
    private String trinhDo;
    private static int sma=10000;

    public Laixe() {
         ma=sma++;
    }

    public Laixe(int ma, String ten, String dc, String trinhDo) {
        this.ma = ma;
        this.ten = ten;
        this.dc = dc;
        this.trinhDo = trinhDo;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Laixe.sma = sma;
    }
     public Object[] toObject(){
         return new Object[]{
           ma,ten,dc,trinhDo
         };
     }
}
