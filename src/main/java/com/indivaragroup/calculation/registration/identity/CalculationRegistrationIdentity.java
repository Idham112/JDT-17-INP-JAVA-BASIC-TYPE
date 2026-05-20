package com.indivaragroup.calculation.registration.identity;

public class CalculationRegistrationIdentity {
    public static void calculateRegisterIdentity() {
        //1. Punya uang 10000
        //2. Kalau saya punya uang 10000, saya harus buat ktp
        //3. Kalau saya harus buat ktp, saya harus bayar uang sebesar 5000
        //4. Buatkan kondisi IF ELSE yang terjadi point 1 & 2
        //5. hasil total pengurangannya
        //Hint gunakan aritmatika operator

        int uang = 15000;

        if(uang == 10000){
            System.out.println("Harus buat KTP, bayar 5000");
            int hasil = uang - 5000;
            System.out.println("Uang sisa anda: " + hasil);
        }else{
            System.out.println("Tidak buat ktp, tidak dikenakan biaya");
        }
    }
}
