package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RH
 */
public class Stasiun {
    private String namaStasiun;
    private String lokasiStasiun;
    private String stasiunFull;
    private String idStasiun;

    public Stasiun(String namaStasiun, String lokasiStasiun, String stasiunFull) {
        this.namaStasiun = namaStasiun;
        this.lokasiStasiun = lokasiStasiun;
        this.stasiunFull = stasiunFull;
    }

    public String getIdStasiun() {
        return idStasiun;
    }

    public void setIdStasiun(String idStasiun) {
        this.idStasiun = idStasiun;
    }
    
    public String getStasiunFull() {
        return stasiunFull;
    }

    public void setStasiunFull(String stasiunFull) {
        this.stasiunFull = stasiunFull;
    }

    public String getNamaStasiun() {
        return namaStasiun;
    }

    public void setNamaStasiun(String namaStasiun) {
        this.namaStasiun = namaStasiun;
    }

    public String getLokasiStasiun() {
        return lokasiStasiun;
    }

    public void setLokasiStasiun(String lokasiStasiun) {
        this.lokasiStasiun = lokasiStasiun;
    }
    
    
}
