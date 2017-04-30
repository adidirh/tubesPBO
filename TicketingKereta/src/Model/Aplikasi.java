/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import Database.FileDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;





/**
 *
 * @author RH
 */
public class Aplikasi {
    private ArrayList<Kereta> daftarKeretaAP;
    private ArrayList<Gerbong> daftarGerbongAP;
    private ArrayList<Stasiun> daftarStasiunAP;
    private ArrayList<Rute> daftarRuteAP;
    private FileDatabase save;
    
    public Aplikasi() {
        daftarKeretaAP = new ArrayList();
        daftarGerbongAP = new ArrayList();
        daftarStasiunAP = new ArrayList();
        daftarRuteAP = new ArrayList();
        save = new FileDatabase();
    }
    
    //method gerbong
    public void createGerbong(String jmlGerbong, String idGerbong) {
        daftarGerbongAP.add(new Gerbong(jmlGerbong, idGerbong));
    }
    
    public Gerbong getGerbong(String id) {
        return daftarGerbongAP.stream()
                .filter(b -> b)
                .findFirst().orElse(null);
    }
    
    public Gerbong getGerbong(int index) {
        Gerbong g = daftarGerbongAP.get(index);
        return g;
    }
    
    public void removeGerbong(String id) {
        for (Gerbong e : daftarGerbongAP){
            if(e.getIdGerbong().equals(id)){
                daftarGerbongAP.remove(e);
            }
        }
    }
        
    
    // Method Kereta
    public void createKereta(ArrayList<Gerbong> daftarGerbong, String keretaFull){
        daftarKeretaAP.add(new Kereta(daftarGerbong, keretaFull));
    }
    
    //(e -> e.g.equals(id))
    public Kereta getKereta(String id){
        return daftarKeretaAP.stream()
                .filter(predicate)
                .findFirst().orElse(null);
    }   
    
    public Kereta getKereta(int index){
        Kereta k = daftarKeretaAP.get(index);
        return k;
    }
    
    public void removeKereta(String id) {
        for (Kereta k : daftarKeretaAP){
            if(k.getIdKereta().equals(id)){
                daftarKeretaAP.remove(k);
            }
        }
    }
    
    //method Rute
    
    //public void createRute()
    
    //method Stasiun
    
    public void createStasiun(String namaStasiun, String lokasiStasiun, String stasiunFull) {
        daftarStasiunAP.add(new Stasiun(namaStasiun,lokasiStasiun, stasiunFull));
    }
    
    public Stasiun getStasiun(String id){
        return daftarStasiunAP.stream()
                .filter(e -> e.getIdStasiun().equals(id))
                .findFirst().orElse(null);
    }
    
    public Stasiun getStasiun(int index) {
       Stasiun s = daftarStasiunAP.get(index);
       return s;
    }
    
    public void removeStasiun(String id) {
        for (Stasiun s : daftarStasiunAP){
            if(s.getIdStasiun().equals(id)){
                daftarStasiunAP.remove(s);
            }
        }
    }
    //public void addKereta();
    //public void addGerbong();
    //public String getGerbong();
    
    //method

    
    
}
