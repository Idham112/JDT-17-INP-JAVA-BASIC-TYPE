package com.indivaragroup.ifStatement;

public class StatementChallenge {
    public static void ParkirKendaraan() {
        /*
        - Sistem Parkir
        - 2 jenis kendaraan
        - Motor dan mobil
        - Motor harga 1 jam pertama 5000 dan selanjutnya 3000
        - Mobil harga 1 jam pertama 8000 dan selanjutnya 5000
        - Motor 3 jam harga yang harus dibayar 11000
        - Harga max motor 30000
        - Harga max mobil 50000
        - jam masuk dan keluar menggunakan Integer jam 1-24
        - jam masuk 13 keluar 13 maka termasuk 1 jam
        */

        String kendaraan = "mobil";
        Integer masuk = 23;
        Integer keluar = 2;

        Integer durasi = 0;
        Integer durasiLebih;
        Integer biaya = 0;

        if(keluar > masuk){
            durasi = keluar - masuk;
        }else if(keluar < masuk){
            durasi = (24 - masuk) + keluar;
        }else if(keluar == masuk){
            durasi = 0;
        }

        if (kendaraan.equals("mobil")) {
            if (durasi <= 1) {
                biaya = 8000;
            } else if (durasi > 1) {
                durasiLebih = durasi - 1;
                biaya = durasiLebih * 5000 + 8000;
                if (biaya > 50000) {
                    biaya = 50000;
                }
            }
        } else if (kendaraan.equalsIgnoreCase("motor")) {
            if(durasi <= 1) {
                biaya = 5000;
            }else if(durasi > 1) {
                durasiLebih = durasi - 1;
                biaya = durasiLebih * 3000 + 5000;
            }if(biaya > 30000) {
                biaya = 30000;
            }
        }

        System.out.println("Kendaraan: " + kendaraan);
        System.out.println("Durasi Parkir: " + durasi + " Jam");
        System.out.println("Biaya Parkir: Rp. " + biaya);

    }
}
