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
    private String rute;
    private String idRute;

    public Rute(Stasiun stasiun1, Stasiun stasiun2, String rute, String idRute) {
        this.stasiun1 = stasiun1;
        this.stasiun2 = stasiun2;
        this.idRute = idRute;
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
    
    public String getRute() {
        return rute;
    }

    public void setRute(String rute) {
        this.rute = rute;
    }
    
    
   /* public String daftarPembeli() {
        return  
    }*/ 

    public String getIdRute() {
        return idRute;
    }

    public void setIdRute(String idRute) {
        this.idRute = idRute;
    }
}
