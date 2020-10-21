package com.company;

public class Main {

    public static void main(String[] args) {
//        Kucing kucing1 = new Kucing();
//        for(int i=0; i < kucing1.warna.length();i++){
//            System.out.println(i + 1);
//        }

        Aritmatika aritmatika = new Aritmatika();
        System.out.println("Hasil penjumlahan 46 + 48 = "+ aritmatika.penjumlahan(46,38));
        System.out.println("Hasil pengurangan 34 + 9 = "+ aritmatika.pengurangan(34,9));
        System.out.println("Hasil perkalian 46 + 48 = "+ aritmatika.perkalian(46,38));
        System.out.println("Hasil pembagian 74 + 4 = "+ aritmatika.pembagian(74,4));
        System.out.println("Hasil sisa bagi 25 + 2 = "+ aritmatika.pembagian(25,2));
        System.out.println();
    }
}
