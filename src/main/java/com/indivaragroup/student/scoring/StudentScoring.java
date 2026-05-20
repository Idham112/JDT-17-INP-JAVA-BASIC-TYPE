package com.indivaragroup.student.scoring;

public class StudentScoring {
    public static void printGrade(){
        //1. Saya punya anak murid 17 orang
        //2. Saya harus memberikan nilai untuk menilai kemampuan mereka
        //3. hasil nilai tersebut harus saya olah berdasarkan nilai apabila
        // * nilai 100 = DIA JAGO BANGET
        // * nilai 90 = DIA BELUM JAGO BANGET TAPI JAGO AJA
        // * nilai 70 = DIA B AJA
        // * nilai DIBAWAH 70 = PERLU BELAJAR LAGI
        //4. Kalau sudah keluar hasilnya tolong di print namanya
        //Nama itu dinamis

        String[] listNames = {"Student1",  "Student2", "Student3", "Student4", "Student5"};
        int[] listScores = {100, 90, 75, 60, 85};

        for(int i = 0; i < listNames.length; i++){

            System.out.println("Nama murid: " + listNames[i]);

            if(listScores[i] == 100){
                System.out.println("DIA JAGO BANGET");
            }else if(listScores[i] >= 90){
                System.out.println("DIA BELUM JAGO BANGET TAPI JAGO AJA");
            }else if(listScores[i] >= 70){
                System.out.println("DIA B AJA");
            }else if(listScores[i] < 70){
                System.out.println("PERLU BELAJAR LAGI");
            }
        }
    }
}
