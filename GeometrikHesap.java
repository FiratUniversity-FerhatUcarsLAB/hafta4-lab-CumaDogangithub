/**
 * Ad Soyad : Cuma Doğan
 * Ogrenci No : 250542003
 * Tarih : 26/10/2025
 * Aciklama : Kullanıcadan yari çap değerini alıp daire ve küre hesaplamalarını yapmaktır
 * */

// kullanıcıdan girdi almak için Scanner sınıfı projeye dahil edildi
import java.util.Scanner;
public class GeometrikHesap {
    public static void  main(String [] args){

        Scanner in = new Scanner(System.in);
        //pi yi sabit olarak ata
        float pi=3.14159f;
        double yariCap,daireAlan,daireCevre,daireCap,kureHacim,kureYuzeyAlan;
        System.out.println("=== GEOMETRIK HESAPLAYICI ===");
        System.out.print("Dairenin yaricapini girin (cm) :");
        //Kullanıcdan yarı çap değerini al
        yariCap=in.nextDouble();
        // matematiksel işlemleri yap (Math.pow(sayi,kuvvet) girilen değerin istenilen sayıda kuvvetini almayı sağlar)
        daireAlan= Math.pow(yariCap,2) * pi;
        daireCevre= 2 * pi * yariCap;
        daireCap= 2*yariCap;
        kureHacim =(double)  4/3 * pi * Math.pow(yariCap,3);
        kureYuzeyAlan =  4*pi*Math.pow(yariCap,2);

        //Sonuclara Ekrana Yazdır
        System.out.println("\nSONUCLAR:");
        System.out.println("----------");

        System.out.printf("Daire Alani      : %.2f",daireAlan);
        System.out.print(" cm"+ "\u00B2 \n");

        System.out.printf("Daire Cevresi    : %.2f",daireCevre);
        System.out.print(" cm\n");

        System.out.printf("Daire Capi       : %.2f",daireCap);
        System.out.print(" cm\n");

        System.out.printf("Kure Hacmi       : %.2f",kureHacim );
        System.out.print(" cm"+ "\u00B3\n");

        System.out.printf("Kure Yuzey Alani : %.2f",kureYuzeyAlan);
        System.out.print(" cm"+ "\u00B2");

         //sistem kaynaklarını gereksiz kullanmamak için sınıf örneği kapatılmıştır
        in.close();
    }
}
