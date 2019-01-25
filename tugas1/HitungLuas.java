package tugas1;

import java.util.Scanner;

public class HitungLuas {

    public static void main(String[] args) {
        //buatfunsgi yang namanya luasPersegiPanjang
        luasPersegiPanjang();
    }
    
    //ini fungsi yg namanya sesuai yg di atas
    public static void luasPersegiPanjang() {
        //deklarasi kenalin dulu variabelnya yg dibutuhkan
        int panjang;
        int lebar;
        int luas;
        
        //fungsi untuk menerima masukkan menggunakan scanner
        Scanner masukkan = new Scanner(System.in);
        
        //buat form panjang lalu simpan k variabel panjang
        System.out.print("Masukan panjang(cm) : ");
        panjang = masukkan.nextInt();
        
        //buat form lebar lalu simpan k variabel lebar
        System.out.print("Masukan Lebar(cm)   : ");
        lebar = masukkan.nextInt();
        
        //ini rumusnya
        luas = panjang * lebar;
        
        //keluarin hasilnya
        System.out.println("Luas persegi panjang " + luas);
        System.out.println("");
        
        //jalankan deh biar cepet moveon
    }
    
}
