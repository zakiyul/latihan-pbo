package com.company;

import java.util.Scanner;

public class Percabangan {

    Scanner masukan = new Scanner(System.in);

    public void ifStatement(){
        System.out.print("lihat berita (y/t) = ");
        String kondisi = masukan.nextLine();
        if(kondisi.equalsIgnoreCase("y")){
            System.out.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n" +
                    "Nunc viverra tempor nisi, in condimentum dolor lacinia sit amet. \n" +
                    "Nulla eleifend molestie facilisis");
        }
    }
    public void ifElseStatement(){
        System.out.print("masukan umur anda = ");
        int umur = masukan.nextInt();

        if (umur >= 18){
            System.out.println("Anda sudah dewasa!");
        } else{
            System.out.println("Masih kecil");
        }
    }
    public void switchCase(){
        System.out.print("masukan nilai mahasiswa (A/B/C) = ");
        String nilai = masukan.nextLine();
        switch (nilai){
            case "A":
                System.out.println("sangat bagus!");
                break;
            case "B":
                System.out.println("bagus");
                break;
            case "C":
                System.out.println("mengulang");
                break;
            default:
                System.out.println("Masukan salah isi nilai hanya di antara A-B-C");
        }
    }
}
