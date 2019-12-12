package com.tutorial;

public class Main {
    ///NAMA:CAHYA SATRIA GUMELAR
    ///NIM:A2.1900028
    ///KELAS:TI-A

    public static void main (String[] args){


//        while (kondisi) {
//            aksi
//        }

        int a = 0;
        boolean kondisi = true;

        System.out.println("awal program");

        while (kondisi) {
            System.out.println("while loop ke-" + a);

            if (a == 10){
                kondisi = false;
            }

            a++;
        }

        System.out.println("akhir program");

    }
}
