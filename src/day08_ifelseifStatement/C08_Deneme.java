package day08_ifelseifStatement;

import java.util.Scanner;

public class C08_Deneme {
    public static void main(String[] args) {

          //* Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
              //  *  dort islemden biri ile isleme koyup sonucun yazdiriniz


        Scanner scan = new Scanner(System.in);//kullanıcıdan input almak için canner obj create ettik.
        System.out.println(" toplama için 1\n çikarma için 2\n bolme için 3\n çarpma için 4");
        //kullanıcıya seçim içn işlem menusu yazdırdık
        System.out.println("lütfen iki tam sayı giriniz : ");//kullanıcıya bildirmde bulunuldu.
        int islem = scan.nextInt();
        double num1 = scan.nextDouble();//1 sayı assign edildi
        double num2 = scan.nextDouble();//2 sayı assign edildi
        if (islem == 1) {
            System.out.println("toplama işleminin sonucu :" + num1 + " + " + num2 + " = " + (num1 + num2));
        }else if (islem == 2) {
            System.out.println("cıkarma işleminin sonucu :" + num1 + " - " + num2 + " = " + (num1 - num2));
        }else if ((islem == 3)) {
            System.out.println("bölme işleminin sonucu :" + num1 + " - " + num2 + " = " + (num1 / num2));
        }else if((islem == 4)) {
            System.out.println("bölme işleminin sonucu :" + num1 + " - " + num2 + " = " + (num1 / num2));

        }else {
            System.out.println("hatalı işlem yaptınız tekrar deneyiniz");
        }
    }
}