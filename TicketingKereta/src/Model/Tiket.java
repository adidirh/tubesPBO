package Model;

import java.util.Date;
import java.io.Serializable;
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
public class Tiket implements Serializable {
    private String jenisKereta;
    private ArrayList<Rute> daftarRute;
    private String noKtp;
    private String namaPembeli;
    private String idTiket;

    public Tiket(String jenisKereta,String noKtp, String namaPembeli, String idTiket, ArrayList<Rute> daftarRute) {
        this.jenisKereta = jenisKereta;
        this.noKtp = noKtp;
        this.namaPembeli = namaPembeli;
        this.idTiket = idTiket;
        daftarRute = new ArrayList();
    }

    public String getJenisKereta() {
        return jenisKereta;
    }

    public void setJenisKereta(String jenisKereta) {
        this.jenisKereta = jenisKereta;
    }

    public String getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(String noKtp) {
        this.noKtp = noKtp;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public String getIdTiket() {
        return idTiket;
    }

    public void setIdTiket(String idTiket) {
        this.idTiket = idTiket;
    }

    public ArrayList<Rute> getDaftarRute() {
        return daftarRute;
    }

    public void setDaftarRute(ArrayList<Rute> daftarRute) {
        this.daftarRute = daftarRute;
    }
    
}
