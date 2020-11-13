package com.tugasPBO;
/*
* Nama      : Argya Aulia Fauzandika
* NIM       : 10119035
* Kelas     : PBO1
* Deskripsi : Perhitungan massa jenis menggunakan getter setter
* */
public class Main {
    public static void main(String[] args){
        Kubus kubus = new Kubus();
        kubus.setSisi(5);
        kubus.setMassa(250);
        int volume = kubus.hitungVolume(kubus.getSisi());
        int massaJenis = kubus.hitungMassaJenis(kubus.getMassa(), volume);

        System.out.println("Massa jenis kubus");
        System.out.println("Sisi : " + kubus.getSisi());
        System.out.println("Massa : "+ kubus.getMassa());
        System.out.println("Hasil perhitungan");
        System.out.println("volume : " + volume);
        System.out.println("Massa jenis : " + massaJenis);

    }

}
