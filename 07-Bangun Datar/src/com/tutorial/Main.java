package com.tutorial;

import java.util.Scanner;

class BangunDatar {
   float Luas(){
      System.out.println("Luas : ");
      return 0;
   }
   float keliling() {
      System.out.println("Keliling : ");
      return 0;
   } 
}

class Persegi extends BangunDatar{
   float sisi(){
      System.out.println("Sisi : ");
      return 0;
   }
}

class Lingkaran extends BangunDatar{
   float jarijari(){
      System.out.println("jari-jari :");
      return 0;
   }
}

class PersegiPanjang extends BangunDatar{
   float panjang(){
      System.out.println("panjang : ");
      return 0;
   }
   float lebar(){
      System.out.println("Lebar : ");
      return 0;
   }
}

class Segitiga extends BangunDatar{
   float alas(){
      System.out.println("Alas : ");
      return 0;
   }
   float tinggi(){
      System.out.println("Tinggi : ");
      return 0;
   }
}


public class Main {
   public static void main(String[] args){
      Scanner n = new Scanner(System.in);
      int pil;
      System.out.println("Menghitung Luas dan Keliling Bangun Datar");
      System.out.println("");
      System.out.println("1. Persegi");
      System.out.println("2. Persegi Panjang");
      System.out.println("3. Lingkaran");
      System.out.println("4. Segitiga");
      System.out.println("5. keluar");
      System.out.println("");
      do{
          System.out.println("Pilih : "); 
      pil = n.nextInt();
      
      switch (pil) {
         
      case 1 :
      
            Persegi Persegi = new Persegi();
            System.out.println("===Persegi===");
            Persegi.sisi();
            Persegi.keliling();
            Persegi.Luas();
         break;
         case 2 :
            PersegiPanjang PersegiPanjang = new PersegiPanjang();
            System.out.println("===Persegi Panjang===");
            PersegiPanjang.panjang();
            PersegiPanjang.lebar();
            PersegiPanjang.keliling();
            PersegiPanjang.Luas();
         break;
         case 3 :
            Lingkaran Lingkaran = new Lingkaran();
            System.out.println("===Lingkaran===");
            Lingkaran.jarijari();
            Lingkaran.keliling();
            Lingkaran.Luas();
         break;
         case 4 :
            Segitiga Segitiga = new Segitiga();
            System.out.println("===Segitiga===");
            Segitiga.alas();
            Segitiga.tinggi();
            Segitiga.keliling();
            Segitiga.Luas();
         break;
         case 5 :
            System.exit(5);
         
            System.out.println("Pilihan yang anda masukan salah");
    
         }
         System.out.println("============\n");
         System.out.println("");
      } while (pil !=5);
      n.close();
   }
}