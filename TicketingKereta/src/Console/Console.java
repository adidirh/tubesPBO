/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Console;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import Model.Aplikasi;
import Model.Kereta;
import Model.Rute;
import Model.Stasiun;
import Model.Tiket;
/**
 *
 * @author RH
 */
public class Console {
    private Aplikasi model;
    private Scanner cinInt;
    private Scanner cinStr;
    
    public Console(Aplikasi model) {
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
                System.out.println("- 2. Cari Gerbong by Index       ");
                System.out.println("- 0. Kembali                     ");
                System.out.println("---------------------------------");
                System.out.println("- Pilih menu : ");
                pil = input();
                switch(pil) {
                    case 1:
                        System.out.println("--- Lihat Gerbong yang Tersedia ---");
                        System.out.println("");
                        break;
                    
                    case 2:
                        System.out.println("--- Cari Gerbong by ID ---");
                        System.out.println("Masukkan ID gerbong yang dicari :"); String idGerbong =cinStr.nextLine();
                        break;
                        
                    case 3:
                        System.out.println("--- Cari Gerbong by Index ---");
                        System.out.println("");
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
        
        public void menuKereta() {
            int pil = 0;
            do {
                try {
                System.out.println("------ Menu Kereta -------");
                System.out.println("- 1. Lihat Semua Kereta   ");
                System.out.println("- 2. Cari Kereta by ID    ");
                System.out.println("- 3. Cari Kereta by Index ");
                System.out.println("- 0. Kembali              ");
                System.out.println("--------------------------");
                System.out.print("- Pilih menu : ");
                pil = input();
                switch (pil) {
                    case 1:
                        System.out.println("--- Lihat Semua Kereta ---");
                        System.out.println("");
                        break;
                        
                    case 2:
                        System.out.println("--- Cari Kereta by ID ---");
                        System.out.println("");
                        break;
                        
                    case 3: 
                        System.out.println("--- Cari Kereta by Index ---");
                        System.out.println("");
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
                System.out.println("- 3. Cari Stasiun by Index ");
                System.out.println("- 0. Kembali               ");
                System.out.println("---------------------------");
                System.out.print("- Pilih menu : ");
                pil = input();
                switch (pil) {
                    case 1:
                        System.out.println("--- Lihat Semua Stasiun ---");
                        System.out.println("");
                        break;
                    
                    case 2:
                        System.out.println("--- Cari Stasiun by ID ---");
                        System.out.println("");
                        break;
                        
                    case 3:
                        System.out.println("--- Cari Stasiun by Index ---");
                        System.out.println("");
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
                System.out.println("- 3. Cari Rute by Index ");
                System.out.println("- 0. Kembali            ");
                System.out.println("------------------------");
                System.out.print("- Pilih menu : ");
                pil = input();
                switch (pil) {
                    case 1:
                        System.out.println("--- Lihat Semua Rute ---");
                        System.out.println("");
                        break;
                    
                    case 2:
                        System.out.println("--- Cari Rute by ID ---");
                        System.out.println("");
                        break;
                    
                    case 3:
                        System.out.println("--- Cari Rute by Index ---");
                        System.out.println("");
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
                System.out.println("- 1. Pesan Tiket              ");
                System.out.println("- 2. Hapus Tiket              ");
                System.out.println("- 3. Lihat Tiket Yang Dibeli  ");
                System.out.println("- 4. Cari Tiket by ID         ");
                System.out.println("- 5. Cari Tiket by Index      ");
                System.out.println("- 0. Kembali                  ");
                System.out.println("--------------------------");
                System.out.println("- Pilih menu : ");
                pil = input();
                switch (pil) {
                    case 1:
                        System.out.println("--- Tambah Tiket ---");
                        System.out.println("- Nama                  :"); String nama = cinStr.nextLine();
                        System.out.println("- Kota Tujuan           :"); String kotaTuj = cinStr.nextLine();
                        System.out.println("- Tanggal Keberangkatan :"); String tanggalBer = cinStr.nextLine();
                        System.out.println("- Jam Keberangkatan     :"); String jamBer = cinStr.nextLine();
                        System.out.println("- ");
                        break;
                    
                    case 2:
                        System.out.println("--- Hapus Tiket ---");
                        System.out.println("");
                        break;
                        
                    case 3:
                        System.out.println("--- Lihat Tiket Yang Dibeli ---");
                        System.out.println("");
                        break;
                        
                    case 4:
                        System.out.println("--- Cari Tiket by ID ---");
                        System.out.println("");
                        break;
                        
                    case 5:
                        System.out.println("--- Cari Tiket by Index");
                        System.out.println("");
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
                        model.loadGerbong;
                        menuGerbong();
                        model.saveGerbong;
                        break;
                    case 2:
                        model.loadKereta;
                        menuKereta();
                        model.saveKereta;
                        break;
                    case 3:
                        model.loadStasiun;
                        menuStasiun();
                        model.saveStasiun;
                        break;
                    case 4:
                        model.loadRute;
                        menuRute();
                        model.saveRute;
                        break;
                    case 5:
                        model.loadTiket;
                        menuTiket();
                        model.saveTiket;
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
