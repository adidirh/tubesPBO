package Model;

import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;

/**
 *
 * @author RH
 */
public class Rute {
    private Stasiun stasiun1;
    private Stasiun stasiun2;
    private ArrayList<Tiket> daftarTiketDibeli;
    private String rute;
    private String idRute;

    public Rute(Stasiun stasiun1, Stasiun stasiun2, ArrayList<Tiket> daftarTiketDibeli, String rute) {
        this.stasiun1 = stasiun1;
        this.stasiun2 = stasiun2;
        this.daftarTiketDibeli = daftarTiketDibeli;
        this.rute = rute;
    }
    
    public Stasiun getStasiun1() {
        return stasiun1;
    }

    public void setStasiun1(Stasiun stasiun1) {
        this.stasiun1 = stasiun1;
    }

    public Stasiun getStasiun2() {
        return stasiun2;
    }

    public void setStasiun2(Stasiun stasiun2) {
        this.stasiun2 = stasiun2;
    }
    
    public void addRute(Tiket t) {
        daftarTiketDibeli.add(t);
    }
 
    public Tiket getTiket(String id) {
        for(Tiket t : daftarTiketDibeli) {
            if(t.getIdTiket().equals(id)) {
                return t;
            }
        }
        return null;
    }
    
    public void removeTiket(String id) {
        for(Tiket t : daftarTiketDibeli) {
            if(t.getIdTiket().equals(id)) {
                daftarTiketDibeli.remove(t);
            }
        }
    }
    
    public String getRute() {
        return rute;
    }

    public void setRute(String rute) {
        this.rute = rute;
    }

    
   /* public String daftarPembeli() {
        return  
    }*/ 
}
