package com.company;
import java.util.Scanner;
public class Operator {
    Scanner masukan = new Scanner(System.in);
    boolean a;
    boolean b;
    int angka1;
    int angka2;

    //Aritmatika
    public void penjumlahan(){
        System.out.print("masukan angka 1 : ");
        angka1 = masukan.nextInt();
        System.out.print("masukan angka 2 : ");
        angka2 = masukan.nextInt();
        int hasil = angka1 + angka2;
        System.out.println(angka1 + " + "+ angka2+ " = " + hasil);
    }
    public void pengurangan(){
        System.out.print("masukan angka 1 : ");
        angka1 = masukan.nextInt();
        System.out.print("masukan angka 2 : ");
        angka2 = masukan.nextInt();
        int hasil = angka1 - angka2;
        System.out.println(angka1 + " - "+ angka2+ " = "+hasil);
    }
    public void perkalian(){
        System.out.print("masukan angka 1 : ");
        angka1 = masukan.nextInt();
        System.out.print("masukan angka 2 : ");
        angka2 = masukan.nextInt();
        int hasil = angka1 * angka2;
        System.out.println(angka1 + " x "+ angka2+ " = "+hasil);
    }
    public void pembagian(){
        System.out.print("masukan angka 1 : ");
        angka1 = masukan.nextInt();
        System.out.print("masukan angka 2 : ");
        angka2 = masukan.nextInt();
        int hasil = angka1 / angka2;
        System.out.println(angka1 + " / "+ angka2+ " = "+hasil);
    }
    public void sisaBagi(){
        System.out.print("masukan angka 1 : ");
        angka1 = masukan.nextInt();
        System.out.print("masukan angka 2 : ");
        angka2 = masukan.nextInt();
        int hasil = angka1 % angka2;
        System.out.println(angka1 + " % "+ angka2+ " = "+hasil);
    }
    //Penugasan
    public void penugasan(){
        System.out.print("masukan angka 1 : ");
        angka1 = masukan.nextInt();
        System.out.print("masukan angka 2 : ");
        angka2 = masukan.nextInt();
        int a = angka1;
        int b = angka2;
        System.out.println("Operator penugasan : ");
        System.out.println(angka1+" = "+angka2+" = "+(a = b));
        System.out.println(angka1+" += "+angka2+" = "+(a += b));
        System.out.println(angka1+" -= "+angka2+" = "+(a -= b));
        System.out.println(angka1+" *= "+angka2+" = "+(a *= b));
        System.out.println(angka1+" /= "+angka2+" = "+(a /= b));
        System.out.println(angka1+" %= "+angka2+" = "+(a %= b));
    }
    //Perbandingan
    public void perbandingan(){
        System.out.print("masukan angka 1 : ");
        angka1 = masukan.nextInt();
        System.out.print("masukan angka 2 : ");
        angka2 = masukan.nextInt();
        int a = angka1;
        int b = angka2;
        System.out.println("Perbandingan");
        System.out.println(angka1+" && "+angka2+(a>b));
        System.out.println(angka1+" || "+angka2+(a<b));
        System.out.println(angka1+" == "+angka2+(a==b));
        System.out.println(angka1+" != "+angka2+(a!=b));
        System.out.println(angka1+" >= "+angka2+(a>=b));
        System.out.println(angka1+" <= "+angka2+(a<=b));
    }
    //Logika
    public void logika(){
//        System.out.println("Operator Logika : ");
        System.out.print("true atau false = ");
        a = masukan.nextBoolean();
        System.out.print("true atau false = ");
        b = masukan.nextBoolean();
        System.out.println(a+" AND "+b+" = "+(a && b));
        System.out.println(a+" OR "+b+" = "+(a || b));
        System.out.println("!"+a+" = "+(!a));
    }
    //Bitwise
    public void bitwise(){
        System.out.print("masukan angka 1 : ");
        angka1 = masukan.nextInt();
        System.out.print("masukan angka 2 : ");
        angka2 = masukan.nextInt();
        int a = angka1;
        int b = angka2;
        System.out.println("Bitwise");
        System.out.println(a+" << "+b+" = "+(a << b));
        System.out.println(a+" >> "+b+" = "+(a >> b));
        System.out.println(a+" & "+b+" = "+(a & b));
        System.out.println(a+" | "+b+" = "+(a | b));
        System.out.println(a+" ^ "+b+" = "+(a ^ b));
        System.out.println(a+" = "+(~a));
    }
    //Ternari
    public void ternary(){
        System.out.print("Masukan nilai akhir = ");
        int nilaiAkhir = masukan.nextInt();
        String hasil = (nilaiAkhir > 50 ) ? "Lulus":"Tidak Lulus";
        System.out.println("Hasil akhir "+ hasil);
    }
}
