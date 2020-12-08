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
public class PhanCong implements Serializable{
    private Laixe laixe;
    private Tuyen tuyen;
    private int sl;

    public PhanCong() {
    }

    public PhanCong(Laixe laixe, Tuyen tuyen, int sl) {
        this.laixe = laixe;
        this.tuyen = tuyen;
        this.sl = sl;
    }

    public Laixe getLaixe() {
        return laixe;
    }

    public void setLaixe(Laixe laixe) {
        this.laixe = laixe;
    }

    public Tuyen getTuyen() {
        return tuyen;
    }

    public void setTuyen(Tuyen tuyen) {
        this.tuyen = tuyen;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
      public Object[] toObject(){
         return new Object[]{
           laixe.getMa(),laixe.getTen(),tuyen.getMa(),sl
         };
     }
}
