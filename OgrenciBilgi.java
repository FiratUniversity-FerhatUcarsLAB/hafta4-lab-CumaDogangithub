/**
 * Ad Soyad : Cuma Doğan
 * Ogrenci No : 250542003
 * Tarih : 25/10/2025
 * Aciklama : Kullanıcan öğrenci bilgilerini alan ve istenilen formatta ekrana düzenli yazdıran program
 * */

// Kullanıcadan bilgi alabilmek için Java kütüphanesinde bulunan Scanner sınıfı kullanılır
import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        // Programda kullanılacak değişkenler atanmıştır
        String ogrAd,ogrSoyad,ogrNo,ogrYas,ogrGpa,ogrGpaMesaj;
        //Scanner sınıfının yeni örneğini oluşturur (System.in standart giriş akımını temsil eder) ve in adında Scanner değişkenine atar
        Scanner in = new Scanner(System.in);
        System.out.printf("%s","=== OGRENCİ BILGI SISTEMI === \n");

        //Ad
        System.out.printf("%s","Adinizi girin : ");
        ogrAd = in.nextLine();

        //Soyad
        System.out.printf("%s","Soyadinizi girin : ");
        ogrSoyad = in.nextLine();

        /**
         * While Döngüsünün,length,matches kullanım amaçları :
         * while : hatalı girilen değerlerin kullanıcıdan tekrar alınması için kullanılmıtır
         * .length(): istenilen sayı değerine eşit veya eşit olmadığını kontrol eder ve string veri türünde kullanılır
         * .matches(): değişkende parantez içerisine girilen değer aralığında bir değere sahip olup olmadığını kontrol eder
         */

        //Ogrenci No
        System.out.printf("%s","Ogrenci numaranizi : ");
        ogrNo = in.nextLine();
        while (ogrNo.length() != 9 || !ogrNo.matches("\\d+") || ogrNo == "") {
            System.out.print("Ogrenci numaraniz (Öğrenci Numarası 9 rakamdan oluşmalı) : ");
            ogrNo = in.nextLine();
        }

        //YAS
        System.out.printf("%s","Yasiniz : ");
        ogrYas = in.nextLine();
        while (!ogrYas.matches("\\d+")  || ogrYas == ""){
            System.out.print("Yasiniz (Lütfen Yaşınızı Girmek İçin Sadece Rakamlar Kullanınız) :  ");
            ogrYas = in.nextLine();
        }


        //GPA
        System.out.print("GPS (0.00 - 4.00) :");
        ogrGpa=in.nextLine();
        while(!ogrGpa.matches("\\d+(\\.\\d+)?") || ogrGpa == "" || Double.parseDouble(ogrGpa) < 0.00  || Double.parseDouble(ogrGpa) > 4.00){
            System.out.print("GPS (0.00 - 4.00) (İstenilen format ve aralıkta değer giriniz) :");
            ogrGpa=in.nextLine();
        }
        //Kullanıcıdan bilgi aldıktan sonra konsolu temizler(kısmen)
        clear();

        // Uzun kod tekrarları yapmamak için string türündeki veriyi double veri türüne dönüştürülüp değişkene atanmıştır
        double ogrGpaDouble = Double.parseDouble(ogrGpa);

        //öğrencinin başarı durumu kontrol ediliyor
        if (ogrGpaDouble >= 3 ){
            ogrGpaMesaj="Basarili Ogrenci";
        }else if (ogrGpaDouble >= 2 && ogrGpaDouble < 3 ){
            ogrGpaMesaj="Ortalama Ogrenci";
        }else {
            ogrGpaMesaj="Basarisiz Ogrenci";
        }


        // Bilgileri Ekrana Yazdırın
        System.out.printf("%s","=== OGRENCİ BILGI SISTEMI === \n");
        System.out.printf("%s","\nAd Soyad: "+ogrAd +" "+ ogrSoyad);
        System.out.printf("\nOgrenci No : %d", Integer.parseInt(ogrNo));
        System.out.printf("\nOgrenci Yas : %d", Integer.parseInt(ogrYas));
        System.out.printf("\nGPA : %.2f", ogrGpaDouble);
        System.out.printf("%s","\n"+ogrGpaMesaj+"\n\n\n\n");

        //sistem kaynaklarını gereksiz kullanmamak için sınıf örneği kapatılmıştır
        in.close();

    }
    public static void clear() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
