package tugas1;

import java.util.Scanner;

public class HitungLuas {

    public static void main(String[] args) {
        luasPersegiPanjang();
        luasLingkaran();
    }
   
    public static void luasPersegiPanjang() {
        int panjang;
        int lebar;
        int luas;
        
        Scanner masukkan = new Scanner(System.in);
        
        System.out.print("Masukan panjang(cm) : ");
        panjang = masukkan.nextInt();
        
        System.out.print("Masukan Lebar(cm)   : ");
        lebar = masukkan.nextInt();
        
        luas = panjang * lebar;
        
        System.out.println("Luas persegi panjang " + luas);
        System.out.println("");
        
    }
    
    public static void luasLingkaran() {
        double jari;
        double luas;
        Scanner masukkan = new Scanner(System.in);
        
        System.out.print("Masukan jari-jari(cm) : ");
        jari = masukkan.nextInt();

        luas = 2 * jari * 3.14;

        System.out.print("Luas lingkaran : " + luas);
        System.out.println("");
    }
    
}
