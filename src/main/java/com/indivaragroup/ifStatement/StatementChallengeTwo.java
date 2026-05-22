package com.indivaragroup.ifStatement;

import java.math.BigDecimal;

public class StatementChallengeTwo {
    public static void Placeholder() {
        /*
        - Kredit rumah
        - input gaji, umur, lama tenor, harga rumah, cicilan perbulan
        - cicilan perbulan = harga rumah/(lama cicilan * 12)
        - X umur < 21 tahun, langsung tolak
        - X lama cicilan > 20 tahun, langsung tolak
        - X jika cicilan perbulan > gaji * 40/100, gaji tidak cukup
        - X gaji > 15 juta && cicilan perbulan <= 30% gaji, maka high value creditor, langsung approve
        - selain itu kredit normal
        - X gaji 7 juta sampai 14.999.999 juta, umur > 25 maka langsung approve
        - X umur < 25 langsung approve tapi butuh penjamin
        - X gaji < 7 juta && cicilan >= 15 tahun resiko kredit tinggi, approve
        - X selain itu di pengajuan dipertimbangkan
        - hasil output 3
        - test case: umur 24, gaji 15 juta, cicilan 16 tahun
        customer high value
        cicilan perbulan berapa
        butuh penjamin
        pengajuan diterima

        */
        double gaji = 6000000;
        Integer umur = 26;
        Integer cicilan = 5;
        double hargaRumah = 50000000;

        String custCategory = "";
        String approval = "";
        Boolean penjamin = false;

        double perbulan = hargaRumah / (cicilan * 12);
        double persenGajiCicilan = (perbulan / gaji) * 100;
        //System.out.println("Perbulan: " + perbulan);
        //System.out.println("gaji: " +  gaji);
        //System.out.println("Persen gaji x cicilan: " + persenGajiCicilan);

        if (umur < 21 || cicilan > 20) {
            approval =  "Tidak Approve";
            penjamin = false;
        } else if (persenGajiCicilan > 40) {
            custCategory = "B AJA";
            approval = "Gaji tidak cukup";
        } else if (gaji > 15000000 && persenGajiCicilan <= 30) {
            custCategory = "HIGH VALUE CREDITOR";
            approval = "APPROVE";
        }else if(gaji >= 7000000 && gaji < 15000000 && umur > 25) {
            custCategory = "B AJA";
            approval = "APPROVE";
        }else if(gaji < 7000000 && cicilan > 15) {
            custCategory = "RESIKO TINGGI";
            approval = "APPROVE";
        }else if(umur < 25){
            custCategory = "B AJA";
            approval = "DIPERTIMBANGKAN";
            penjamin = true;
        }else{
            custCategory = "B AJA";
            approval = "DIPERTIMBANGKAN";
        }

        System.out.println("Cust Category: " + custCategory);
        System.out.println("Approval: " + approval);
        if(!penjamin){
            System.out.println("Penjamin: Tidak perlu penjamin");
        }else{
            System.out.println("Penjamin: Butuh penjamin");
        }

    }
}
