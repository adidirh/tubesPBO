package Model;

import java.util.Date;
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
public class Tiket implements Serializable {
    private String jenisKereta;
    private String stasiunAwal;
    private String stasiunTuj;
    private String noKtp;
    private String namaPembeli;
    private String idTiket;
    private Date tanggal;

    public Tiket(String jenisKereta, String stasiunAwal, String stasiunTuj, String noKtp, String namaPembeli, String idTiket, Date tanggal) {
        this.jenisKereta = jenisKereta;
        this.stasiunAwal = stasiunAwal;
        this.stasiunTuj = stasiunTuj;
        this.noKtp = noKtp;
        this.namaPembeli = namaPembeli;
        this.idTiket = idTiket;
        this.tanggal = tanggal;
    }
    
    /*Tiket(Date tanggal) {
        this.tanggal = tanggal;
    }*/

    public String getJenisKereta() {
        return jenisKereta;
    }

    public void setJenisKereta(String jenisKereta) {
        this.jenisKereta = jenisKereta;
    }

    public String getStasiunAwal() {
        return stasiunAwal;
    }

    public void setStasiunAwal(String stasiunAwal) {
        this.stasiunAwal = stasiunAwal;
    }

    public String getStasiunTuj() {
        return stasiunTuj;
    }

    public void setStasiunTuj(String stasiunTuj) {
        this.stasiunTuj = stasiunTuj;
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
}
