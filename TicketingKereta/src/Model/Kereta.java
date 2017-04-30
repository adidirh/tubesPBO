package Model;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RH
 */
public class Kereta {
    private ArrayList<Gerbong> daftarGerbong;
    private String keretaFull;
    private String idKereta;

    public Kereta(ArrayList<Gerbong> daftarGerbong, String keretaFull) {
        this.keretaFull = keretaFull;
    }
    
    public void addGerbong(Gerbong g){
        daftarGerbong.add(g);
    }
    
    public Gerbong getGerbong(String id)  {
        for(Gerbong g : daftarGerbong) {
            if(g.getIdGerbong().equals(id)) {
                return g;
            }
        }
        return null;
    }
    
    public void removeGerbong(String id) {
        for (Gerbong g : daftarGerbong) {
            if(g.getIdGerbong().equals(id)) {
                daftarGerbong.remove(g);
            }
        }
    }

    public String getKeretaFull() {
        return keretaFull;
    }

    public void setKeretaFull(String keretaFull) {
        this.keretaFull = keretaFull;
    }

    public String getIdKereta() {
        return idKereta;
    }

    public void setIdKereta(String idKereta) {
        this.idKereta = idKereta;
    }
    
}
