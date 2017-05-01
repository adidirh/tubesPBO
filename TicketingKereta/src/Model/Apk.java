/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;


import Database.FileDatabase;
import java.util.ArrayList;
import java.util.Date;





/**
 *
 * @author RH
 */
public class Apk {
    private ArrayList<Kereta> daftarKeretaAP;
    private ArrayList<Gerbong> daftarGerbongAP;
    private ArrayList<Stasiun> daftarStasiunAP;
    private ArrayList<Rute> daftarRuteAP;
    private ArrayList<Tiket> daftarTiketAP;
    private FileDatabase save;
    
    public Apk() {
        daftarKeretaAP = new ArrayList();
        daftarGerbongAP = new ArrayList();
        daftarStasiunAP = new ArrayList();
        daftarRuteAP = new ArrayList();
        daftarTiketAP = new ArrayList();
        save = new FileDatabase();
    }
    
    //method gerbong
    public void createGerbong(String jmlGerbong, String idGerbong) {
        daftarGerbongAP.add(new Gerbong(jmlGerbong, idGerbong));
    }
    
    public Gerbong getGerbong(String id) {
        Gerbong x = null;
        for (Gerbong g : daftarGerbongAP) {
            if (g.getIdGerbong().equals(id)){
                x = g;
                break;
            }
        } 
        return x;
    }
    
    public Gerbong getGerbong(int index) {
        Gerbong g = daftarGerbongAP.get(index);
        return g;
    }
    
    public void removeGerbong(String id) {
        for (Gerbong e : daftarGerbongAP){
            if(e.getIdGerbong().equals(id)){
                daftarGerbongAP.remove(e);
                break;
            }
        }
    }
    
    
    // Method Kereta
    public void createKereta(ArrayList<Gerbong> daftarGerbong, String keretaFull){
        daftarKeretaAP.add(new Kereta(daftarGerbong, keretaFull));
    }
    
    //(e -> e.g.equals(id))
    public Kereta getKereta(String id){
        Kereta x = null;
        for (Kereta k : daftarKeretaAP){
            if(k.getIdKereta().equals(id)){
                x = k;
                break;
            }
        } return x;
    }   
    
    public Kereta getKereta(int index){
        Kereta k = daftarKeretaAP.get(index);
        return k;
    }
    
    public void removeKereta(String id) {
        for (Kereta k : daftarKeretaAP){
            if(k.getIdKereta().equals(id)){
                daftarKeretaAP.remove(k);
                break;
            }
        }
    }
    
    //method Rute
    public void createRute(Stasiun stasiun1, Stasiun stasiun2, String rute, String idRute){
        daftarRuteAP.add(new Rute(stasiun1, stasiun2, rute, idRute));
    }
    
    public Rute getRute(String id) {
        Rute x = null;
        for (Rute r : daftarRuteAP){
            if (r.getIdRute().equals(id)) {
                x = r;
                break;
            }
        } return x;
    }
    
    public Rute getRute(int index) {
        Rute r = daftarRuteAP.get(index);
        return r;
    }
    
    public void removeRute(String id){
        for (Rute r : daftarRuteAP){
            if(r.getIdRute().equals(id)){
                daftarRuteAP.remove(r);
                break;
            }
        }
    }

    //method Stasiun
    
    public void createStasiun(String lokasiStasiun, String idStasiun) {
        daftarStasiunAP.add(new Stasiun(lokasiStasiun,idStasiun));
    }
    
    public Stasiun getStasiun(String id){
        Stasiun x = null;
        for (Stasiun s : daftarStasiunAP){
            if(s.getIdStasiun().equals(id)) {
                x = s;
                break;
            }
        } return x;
    }
    
    public Stasiun getStasiun(int index) {
       Stasiun s = daftarStasiunAP.get(index);
       return s;
    }
    
    public void removeStasiun(String id) {
        for (Stasiun s : daftarStasiunAP){
            if(s.getIdStasiun().equals(id)){
                daftarStasiunAP.remove(s);
                break;
            }
        }
    }
    
    //method Tiket 
    public void createTiket(String jenisKereta, String noKtp, String namaPembeli, String idTiket,ArrayList<Rute> daftarRute){
        daftarTiketAP.add(new Tiket(jenisKereta, noKtp, namaPembeli, idTiket, daftarRute));
    }
    
    public Tiket getTiket(String id) {
        Tiket x = null;
        for(Tiket t : daftarTiketAP){
            if(t.getIdTiket().equals(id)){
                x = t;
                break;
            }
        } return x;
    }
    
    public Tiket getTiket(int index){
        Tiket t = daftarTiketAP.get(index);
        return t;
    }
    
    public void removeTiket(String id){
        Tiket x = null;
        for (Tiket t : daftarTiketAP){
            if(t.getIdTiket().equals(id)){
                daftarTiketAP.remove(t);
            }
        }
    }
    

    
    
}
