package com.emre._2_week;

//  kullanicinin verdigi sayıya kadar toplamı alan  algoritma
// şart = kullanıcı eğer sayı olarak 100'den fazla girerse 100 kadar toplasın.
// şart = kullanıcı verdiği sayilar içinde eğer 47 varsa bunu toplama dahil etmesin
// çıkan sonuç  tek mi çift mi
import java.util.Scanner;

public class _11_1_Return_Continue_Break {
    public static void main(String[] args) {

        Scanner klavye=new Scanner(System.in);
        System.out.println(" deger  : ");
        int deger = Math.abs(klavye.nextInt());


        int sum = 0 ;

        for (int i = 1; i < deger; i++) {
                // eger 47 varsa
                if(i==47){
                    System.out.println("verdiginiz sayıda 47 oldugundan degere eklenilmez!");
                    continue; // 47 dahil degil
                }
                //100'de fazla ise
                if(i>100){
                    System.out.println("Verdiğiniz sayı 100 büyük olduğu için sadece 1<=SAYI<=100 kadar toplama yapabilir.");
                    break;// 100'den sonra toplamı durdur.
                }

                //toplama
               // sum=sum+i //1.yol
             sum+=i;

        }
        System.out.println("Toplam : "+sum);


         // tek mi cift mi
        if (sum % 2 == 0)
            System.out.println(sum + " sayı çift");
        else
            System.out.println(sum + " sayı tek");

        // Klavye Kapat
        klavye.close();



    }


}
