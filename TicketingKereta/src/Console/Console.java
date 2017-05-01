/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Console;
import Database.FileDatabase;
import java.util.InputMismatchException;
import java.util.Scanner;
import Model.Apk;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author RH
 */
public class Console {
    private Apk model;
    private Scanner cinInt;
    private Scanner cinStr;
    
    public Console(Apk model) {
        this.model = model;
        cinInt = new Scanner(System.in);
        cinStr = new Scanner(System.in);
    }

    public int input(){
        try {
            return cinInt.nextInt();
        } catch(InputMismatchException e) {
            throw new InputMismatchException("Inputan adalah integer");
        } finally{
            cinInt = new Scanner(System.in);
        }
    }
    
    public void menuGerbong() {
        int pil = 0;
        do {
            try {
                System.out.println("------ Menu Gerbong -------------");
                System.out.println("- 1. Lihat Gerbong yang Tersedia ");
                System.out.println("- 2. Cari Gerbong by ID          ");
                System.out.println("- 0. Kembali                     ");
                System.out.println("---------------------------------");
                System.out.println("- Pilih menu : ");
                pil = input();
                switch(pil) {
                    case 1:
                        System.out.println("--- Lihat Gerbong yang Tersedia ---");
                        try {
                            FileDatabase db = new FileDatabase();
                            ResultSet rs = null;
                            rs = db.getData("Select * from gerbong");
                            while (rs.next()) {
                                System.out.println(rs.getString("idGerbong")+" "+rs.getString("jmlGerbong"));
                            }
                            rs.close();
                        } catch (Exception e) {
                             System.out.println(e.getMessage());
                        }
                        break;
                    
                    case 2:
                        System.out.println("--- Cari Gerbong by ID ---");
                        System.out.println("Masukkan ID gerbong yang dicari :"); String idGerbong =cinStr.nextLine();
                        try {
                            FileDatabase db = new FileDatabase();
                            ResultSet rs = null;
                            rs = db.getData("Select * from gerbong where idGerbong = '" +idGerbong+ "' ;");
                            while (rs.next()) {
                                System.out.println(rs.getString("idGerbong")+" "+rs.getString("jmlGerbong"));
                            }
                            rs.close();
                        } catch (Exception e) {
                             System.out.println(e.getMessage());
                        }
                        break;
                    case 0:
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error," + e.getMessage());
            } finally {
                cinInt = new Scanner(System.in);
                cinStr = new Scanner(System.in);
            }
        } while(pil != 0);
        }
        
        public void menuKereta() throws SQLException {
            int pil = 0;
            do {
                try {
                System.out.println("------ Menu Kereta -------");
                System.out.println("- 1. Lihat Semua Kereta   ");
                System.out.println("- 2. Cari Kereta by ID    ");
                System.out.println("- 0. Kembali              ");
                System.out.println("--------------------------");
                System.out.print("- Pilih menu : ");
                pil = input();
                switch (pil) {
                    case 1:
                        System.out.println("--- Lihat Semua Kereta ---");
                    try{
                        FileDatabase db = new FileDatabase();
                            ResultSet rs = null;
                            rs = db.getData("Select * from Kereta");
                            while (rs.next()) {
                                System.out.println(rs.getString("idKereta")+" "+rs.getString("jenisKereta"));
                            }
                            rs.close();
                        } catch (Exception e) {
                             System.out.println(e.getMessage());
                        }
                        break;
                        
                    case 2:
                        System.out.println("--- Cari Kereta by ID ---");
                        System.out.println("Masukkan ID kereta yang dicari :"); String idKereta =cinStr.nextLine();
                         try {
                            FileDatabase db = new FileDatabase();
                            ResultSet rs = null;
                            rs = db.getData("Select * from gerbong where idKereta = '" +idKereta+ "' ;");
                            while (rs.next()) {
                                System.out.println(rs.getString("idKereta")+" "+rs.getString("jenisKereta"));
                            }
                            rs.close();
                        } catch (Exception e) {
                             System.out.println(e.getMessage());
                        }
                        break;
                        
                    case 0:
                        break;
                }
                    
                } catch(Exception e){
                        System.out.println("Error,"+ e.getMessage());    
                } finally {
                    cinInt = new Scanner(System.in);
                    cinStr = new Scanner(System.in);
                }
            } while(pil != 0);
            }
        public void menuStasiun() {
            int pil = 0;
            do {
                try {
                System.out.println("------ Menu Stasiun -------");
                System.out.println("- 1. Lihat semua Stasiun   ");
                System.out.println("- 2. Cari Stasiun by ID    ");
                System.out.println("- 0. Kembali               ");
                System.out.println("---------------------------");
                System.out.print("- Pilih menu : ");
                pil = input();
                switch (pil) {
                    case 1:
                        System.out.println("--- Lihat Semua Stasiun ---");
                    try{
                        FileDatabase db = new FileDatabase();
                            ResultSet rs = null;
                            rs = db.getData("Select * from Stasiun");
                            while (rs.next()) {
                                System.out.println(rs.getString("idStasiun")+" "+rs.getString("lokasiStasiun"));
                            }
                            rs.close();
                        } catch (Exception e) {
                             System.out.println(e.getMessage());
                        }
                        break;
                    
                    case 2:
                        System.out.println("--- Cari Stasiun by ID ---");
                        System.out.println("Masukkan ID Stasiun yang dicari :"); String idStasiun =cinStr.nextLine();
                         try {
                            FileDatabase db = new FileDatabase();
                            ResultSet rs = null;
                            rs = db.getData("Select * from gerbong where idStasiun = '" +idStasiun+ "' ;");
                            while (rs.next()) {
                                System.out.println(rs.getString("idStasiun")+" "+rs.getString("lokasiStasiun"));
                            }
                            rs.close();
                        } catch (Exception e) {
                             System.out.println(e.getMessage());
                        }
                        break;
                    case 0:
                        break;
                }
                } catch(Exception e) {
                    System.out.println("Error,"+ e.getMessage());
                } finally {
                    cinInt = new Scanner(System.in);
                    cinStr = new Scanner(System.in);
                }
            } while(pil != 0 );
        }
        public void menuRute(){
            int pil = 0;
                do {
                    try {
                System.out.println("------ Menu Rute -------");
                System.out.println("- 1. Lihat semua Rute   ");
                System.out.println("- 2. Cari Rute by ID    ");
                System.out.println("- 0. Kembali            ");
                System.out.println("------------------------");
                System.out.print("- Pilih menu : ");
                pil = input();
                switch (pil) {
                    case 1:
                        System.out.println("--- Lihat Semua Rute ---");
                        try{
                        FileDatabase db = new FileDatabase();
                            ResultSet rs = null;
                            rs = db.getData("Select * from Rute");
                            while (rs.next()) {
                                System.out.println(rs.getString("idRute")+" "+rs.getString("rute"));
                            }
                        rs.close();
                        } catch (Exception e) {
                             System.out.println(e.getMessage());
                        }
                        break;
                    
                    case 2:
                        System.out.println("--- Cari Rute by ID ---");
                          System.out.println("Masukkan ID Rute yang dicari :"); String idRute =cinStr.nextLine();
                         try {
                            FileDatabase db = new FileDatabase();
                            ResultSet rs = null;
                            rs = db.getData("Select * from gerbong where idRute = '" +idRute+ "' ;");
                            while (rs.next()) {
                                System.out.println(rs.getString("idRute")+" "+rs.getString("rute"));
                            }
                        rs.close();
                        } catch (Exception e) {
                             System.out.println(e.getMessage());
                        }
                        break;
                    case 0:
                        break;
                }
                    } catch(Exception e) {
                        System.out.println("Error,"+ e.getMessage());
                } finally {
                        cinInt = new Scanner(System.in);
                        cinStr = new Scanner(System.in);
                    } 
                } while (pil != 0);
        }

   
    public void menuTiket(){
    int pil = 0;
    do {
        try {
                System.out.println("------ Menu Tiket -------");
                System.out.println("- 1. Tambah Tiket             ");
                System.out.println("- 2. Hapus Tiket by ID        ");
                System.out.println("- 3. Lihat Tiket Yang Dibeli  ");
                System.out.println("- 4. Cari Tiket by ID         ");
                System.out.println("- 0. Kembali                  ");
                System.out.println("--------------------------");
                System.out.println("- Pilih menu : ");
                pil = input();
                switch (pil) {
                    case 1:
                        System.out.println("--- Tambah Tiket ---");
                        System.out.println("- Nama                  :"); String nama = cinStr.nextLine();
                        System.out.println("- NoKtp                 :"); String noKtp = cinStr.nextLine();
                        System.out.println("- Rute                  :"); String rute = cinStr.nextLine();
                        System.out.println("- Jenis Kereta          :"); String jenisK = cinStr.nextLine();
                    try{
                        FileDatabase db = new FileDatabase();
                            ResultSet rs = null;
                            rs = db.getData("Select * from Tiket insert into Tiket values =('idTiket','nama'"+nama+"'noKtp'"+noKtp+"'ruteTuj'"+rute+"'JenisKereta'"+jenisK+"');");
                            while (rs.next()) {
                                System.out.println(rs.getString("idTiket")+" "+rs.getString("nama")+" "+rs.getString("noKtp")+" "+rs.getString("ruteTuj")+" "+rs.getString("JenisKereta"));
                            }
                            rs.close();
                        } catch (Exception e) {
                             System.out.println(e.getMessage());
                        }
                    
                    case 2:
                        System.out.println("--- Hapus Tiket ---");
                        
                        break;
                        
                    case 3:
                        System.out.println("--- Lihat Tiket Yang Dibeli ---");
                        try{
                        FileDatabase db = new FileDatabase();
                            ResultSet rs = null;
                            rs = db.getData("Select * from tiket");
                            while (rs.next()) {
                                System.out.println(rs.getString("idTiket")+" "+rs.getString("nama")+" "+rs.getString("noKtp")+" "+rs.getString("ruteTuj")+" "+rs.getString("JenisKereta"));
                            }
                        rs.close();
                        } catch (Exception e) {
                             System.out.println(e.getMessage());
                        }
                        break;
                        
                    case 4:
                        System.out.println("--- Cari Tiket by ID ---");
                        System.out.println("Masukkan ID Tiket yang dicari :"); String idTiket =cinStr.nextLine();
                        try {
                            FileDatabase db = new FileDatabase();
                            ResultSet rs = null;
                            rs = db.getData("Select * from gerbong where idTiket = '" +idTiket+ "' ;");
                            while (rs.next()) {
                             System.out.println(rs.getString("idTiket")+" "+rs.getString("nama")+" "+rs.getString("noKtp")+" "+rs.getString("ruteTuj")+" "+rs.getString("JenisKereta"));
                            }
                        rs.close();
                        } catch (Exception e) {
                             System.out.println(e.getMessage());
                        }
                        break;
                    case 0:
                        break;
                }
            } catch(Exception e) {
                System.out.println("Error,"+ e.getMessage());
            } finally {
            cinInt = new Scanner(System.in);
            cinStr = new Scanner(System.in);
        }
        } while (pil != 0);
    }
    
    public void menuUtama() {
        int pil = 0;
        do {
            try {
                System.out.println("------ Menu Utama -------");
                System.out.println("- 1. Menu Gerbong    ");
                System.out.println("- 2. Menu Kereta     ");
                System.out.println("- 3. Menu Stasiun    ");
                System.out.println("- 4. Menu Rute       ");
                System.out.println("- 5. Menu Tiket      ");
                System.out.println("- 0. Exit            ");
                System.out.println("-------------------------");
                System.out.print("- Pilih menu : ");
                pil = input();
                switch (pil){
                    case 1:
                        menuGerbong();
                        break;
                    case 2:
                        menuKereta();
                        break;
                    case 3:
                        menuStasiun();
                        break;
                    case 4:
                        menuRute();
                        break;
                    case 5:
                        menuTiket();
                        break;
                    case 0:
                        break;
            }
        } catch(Exception e) {
                System.out.println("Error,"+ e.getMessage());
        } finally {
                cinInt = new Scanner(System.in);
                cinStr = new Scanner(System.in);
            }
    } while (pil != 0);
}
}
