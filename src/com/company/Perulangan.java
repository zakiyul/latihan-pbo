package com.company;

import java.util.Scanner;

public class Perulangan {

    Scanner masukan  = new Scanner(System.in);

    public void forLoop(){
        System.out.print("enter your number = ");
        int a = masukan.nextInt();
        for(int i = 0; i <= a;i++){
            System.out.println(i);
        }
    }
    public void forEach(){
        String[] mahasiswa = new String[5];
        String a;
        for(int i = 0; i < mahasiswa.length; i++){
            System.out.print("Masukan nama mahasiswa ke "+(i+1)+" = ");
            mahasiswa[i] = masukan.nextLine();
        }
        for(String data : mahasiswa){
            System.out.println(data);
        }
    }
    public void whileLoop(){
        int i = 0;
        System.out.print("Masukan angka = ");
        int angka = masukan.nextInt();
        while(i <= angka) {
            System.out.println(i);
            i++;
        }
    }
    public void doWhileLoop(){
        int i = 0;
        System.out.print("Masukan angka = ");
        int angka = masukan.nextInt();
        do {
            System.out.println("jumlah angka sekarang = "+ i);
            i++;
        }while(i <= angka);
    }
    public void nestedLoop(){
        System.out.print("masukan jumlah i = ");
        int angkaI = masukan.nextInt();
        System.out.print("masukan jumlah j = ");
        int angkaJ = masukan.nextInt();
        for(int i = 1;i <= angkaI;i++){
            System.out.println("====================[ i ke "+ i + " ]=====================");
            for(int j = 1; j <= angkaJ; j++){
                System.out.println("i = "+ i);
                System.out.println("j = "+ j);
                System.out.println("---------");
            }
        }
    }
}
