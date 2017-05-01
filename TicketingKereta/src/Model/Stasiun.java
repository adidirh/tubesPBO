package Model;

import java.io.Serializable;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RH
 */
public class Stasiun implements Serializable {
    private String lokasiStasiun;
    private String idStasiun;

    public Stasiun( String lokasiStasiun, String idStasiun) {
        this.lokasiStasiun = lokasiStasiun;
        this.idStasiun = idStasiun;
    }

    public String getIdStasiun() {
        return idStasiun;
    }

    public void setIdStasiun(String idStasiun) {
        this.idStasiun = idStasiun;
    }

    public String getLokasiStasiun() {
        return lokasiStasiun;
    }

    public void setLokasiStasiun(String lokasiStasiun) {
        this.lokasiStasiun = lokasiStasiun;
    }
    
    
}
