package com.tutorial;

class Polos {
    String dataString;
    int dataInteger;
}
// class dengan konstruktor
class Mahasiswa {
    String nama;
    String nim;
    String prodi;
    
    // Membuat konstruktor
    Mahasiswa() {
        
    }
}
   


public class Main {
    public static void main(String[] args) {
        System.out.println("Program JAVA Pertama Saya");
        Polos pls = new Polos();

//isi ciri pada objek pls
pls.dataString = "polos";
pls.dataInteger = 10;

System.out.println("Isi Data String :"+ pls.dataString);
System.out.println("isi data Integer:"+ pls.dataInteger);
    }   
}


