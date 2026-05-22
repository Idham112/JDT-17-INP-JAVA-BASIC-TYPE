package com.indivaragroup.ifStatement;

public class IfStateChallenge {
    public static void IfStateChallenge(){
        /*
         Menentukan kelulusan
         - ada 3 variable yang digunakan
         - nilai tugas, nilai ujian, nilai absensi
         - jika rata rata nilai dari 3 nilai tersebut lebih besar dari 75 maka lakukan print Selamat Lulus
         - jika rata rata nilai dari 3 nilai tersebut lebih dari 90, print Sebuah apresiasi
         - jika rata rata nilai dari 3 nilai tersebut lebih kecil dari 65 dan 75 maka print informasi harus mengikuti remedial
         - jika rata rata lebih kecil sama dengan 65 maka print ulang lagi tahun depan
        */

        int tugas = 80;
        int ujian = 80;
        int absensi = 80;
        int avg = (tugas + ujian + absensi)/3;

        if(avg > 75 && avg <= 90){
            System.out.println("Selamat anda Lulus");
        };
        if(avg > 90){
            System.out.println("Anda jago banget");
        };
        if(avg > 65 && avg <= 75){
            System.out.println("Remedial");
        };
        if(avg <= 65){
           System.out.println("Ulang lagi tahun depan");
        };
    }
}
