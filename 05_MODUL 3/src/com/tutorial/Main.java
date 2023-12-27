package com.tutorial;


class  Pegawai {
    public String nama;
    public String jabatan;
    public float pajak;
    public float gajipokok;
    public float gajibersih;

    Pegawai(String nama, String jabatan, float pajak, float gajiPokok){
        this.nama = nama;
        this.jabatan = jabatan;
        this.pajak = pajak/100;
        this.gajipokok = gajiPokok;
    }
    public float setPajak(float pajak){
        return this.pajak = pajak/100;
    }

    public float setgajiBersih(){
    return this.gajipokok - (this.gajipokok*this.pajak);
    }
    public void display(){
        System.out.println("Nama karyawan:" + this.nama);
        System.out.println("Jabatan:" + this.jabatan);
        System.out.println("Gaji Bersih:" + this.setgajiBersih());
    }
}
  

public class Main {

    public static void main(String[] args) {
        Pegawai gaji = new Pegawai ("BAIQSIFA", "DOSEN", 10, 3500000);
        gaji.display();
        gaji.setPajak(75);
        gaji.display();
    }
}