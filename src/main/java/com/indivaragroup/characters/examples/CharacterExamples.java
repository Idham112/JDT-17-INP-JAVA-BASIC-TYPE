package com.indivaragroup.characters.examples;

public class CharacterExamples {
    public static void characterExamples() {
        char huruf = 'A';
        char angka = '7';
        char simbol = '#';
        char spasi = ' ';

        System.out.println("Huruf: " + huruf);
        System.out.println("Angka: " + angka);
        System.out.println("Simbol: " + simbol);
        System.out.println("Spasi: [" + spasi + "]");

        //escape sequence
        char newline = '\n';
        char tab = '\t';
        char quote = '\'';

        System.out.println("Escape sequence: ");
        System.out.println("Baris 1" + newline + "Baris 2");
        System.out.println("Kolom1" + tab + "Kolom2");
        System.out.println("Tanda kutip: " + quote);
    }
}
