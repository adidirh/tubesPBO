package Model;

import java.util.ArrayList;
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
public class Kereta implements Serializable {
    private ArrayList<Gerbong> daftarGerbong;
    private String idKereta;
    private String jenisKereta;
    

    public Kereta(ArrayList<Gerbong> daftarGerbong, String keretaFull) {
        daftarGerbong = new ArrayList();
        this.idKereta = idKereta;
    }

    public String getJenisKereta() {
        return jenisKereta;
    }

    public void setJenisKereta(String jenisKereta) {
        this.jenisKereta = jenisKereta;
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

    public String getIdKereta() {
        return idKereta;
    }

    public void setIdKereta(String idKereta) {
        this.idKereta = idKereta;
    }
    
    public Gerbong getGerbongByIndex(int index){
        return daftarGerbong.get(index);
    }
    
}
