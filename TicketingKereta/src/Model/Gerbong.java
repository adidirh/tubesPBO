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
public class Gerbong implements Serializable {
    private String gerbongFull;
    private String jmlGerbong;
    private String idGerbong;

    public Gerbong(String jmlGerbong, String idGerbong) {
        this.jmlGerbong = jmlGerbong;
        this.idGerbong = idGerbong;
    }
    
    public String getJmlGerbong() {
        return jmlGerbong;
    }

    public void setJmlGerbong(String jmlGerbong) {
        this.jmlGerbong = jmlGerbong;
    }
    
    public String getGerbongFull() {
        return gerbongFull;
    }

    public void setGerbongFull(String gerbongFull) {
        this.gerbongFull = gerbongFull;
    }

    public String getIdGerbong() {
        return idGerbong;
    }

    public void setIdGerbong(String idGerbong) {
        this.idGerbong = idGerbong;
    }
     
}
