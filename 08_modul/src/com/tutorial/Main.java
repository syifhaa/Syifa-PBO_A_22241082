package com.tutorial;

class Pelanggan {
    private String nama;
    private boolean punyaMember;
    private double totalBelanja;
    private double potongan;

    public Pelanggan(String nama, boolean punyaMember, double totalBelanja) {
        this.nama = nama;
        this.punyaMember = punyaMember;
        this.totalBelanja = totalBelanja;
        hitungPotongan();
    }

    private void hitungPotongan() {
        if (punyaMember) {
            if (totalBelanja > 500000) {
                potongan = 0.1 * totalBelanja;
            } else if (totalBelanja > 100000 && totalBelanja < 500000) {
                potongan = 0.05 * totalBelanja;
            } else {
                potongan = 0.03 * totalBelanja;
            }
        } 
        else {
            if (totalBelanja > 100000) {
                potongan = 0.03 * totalBelanja;
            } else {
                potongan = 0;
            }
        }
    }

    public void tampilkanInfo() {
        System.out.println("Nama Pelanggan: " + nama);
        System.out.println("Status Member: " + (punyaMember ? "Punya Member" : "Tidak Punya Member"));
        System.out.println("Total Belanja Sebelum Potongan: Rp " + totalBelanja);
        System.out.println("Diskon (dalam persen): " + (potongan / totalBelanja) * 100 + "%");
        System.out.println("Diskon (dalam rupiah): Rp " + potongan);
        System.out.println("Total Belanja Setelah Potongan: Rp " + (totalBelanja - potongan));
    }
}

    public class Main {

    public static void main(String[] args) {
        Pelanggan pelanggan1 = new Pelanggan("Baiq", true, 550000);
        pelanggan1.tampilkanInfo();

        System.out.println();

        Pelanggan pelanggan2 = new Pelanggan("Sifa", false, 150000);
        pelanggan2.tampilkanInfo();
    }
}
