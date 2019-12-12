package com.tutorial;

public class Main {
    ///NAMA:CAHYA SATRIA GUMELAR
    ///NIM:A2.1900028
    ///KELAS:TI-A


    public static void main (String[] args){


//        do {
//            aksi
//        } while (kondisi);


        System.out.println("ini adalah awal program");

        int a = 0;
        boolean kondisi = true;


        do {
            a++;
            System.out.println("do while ke-" + a);

            if (a == 1) {
                kondisi = false;
            }

        }while(kondisi);

        System.out.println("ini adalah akhir program");
    }
}
