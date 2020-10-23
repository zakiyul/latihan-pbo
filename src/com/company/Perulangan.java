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
}
