/**
 * Ad Soyad : Cuma Doğan
 * Ogrenci No : 250542003
 * Tarih : 26/10/2025
 * Aciklama : Çalışan bilgilerini alıp maaş bodrosu oluşturan program
 * */

import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        String calAd,calSoyad;
        int gunCalismaSaati,mesSaatiSayi;
        double brutMaas,mesUcreti,toplamGelir,sgk,gelirVergisi,damgaVergisi,toplamKesinti,netMaas,kesintiOrani,saatlikNetKazanc,gunNetKazanc;

        //Sabit Atama
        final float SGK_ORANI = 0.14f;
        final float GELIR_VERGISI_ORANI = 0.15f;
        final float DAMGA_VERGISI_ORANI = 0.00759f;
        final float MESAI_UCRET_ORANI =1.5f;

        // Kullanıcıdan girdi alma
        System.out.println("====================================");
        System.out.println("       MAAS BORDROSU HESAPLAMA");
        System.out.println("====================================");

        System.out.print("Adinizi girin:");
        calAd = in.nextLine();

        System.out.print("Soyadinizi girin:");
        calSoyad = in.nextLine();

        System.out.print("Aylik Burut Maasiniz:");
        brutMaas = in.nextDouble();

        System.out.print("Gunluk Calisma Saatiniz:");
        gunCalismaSaati = in.nextInt();

        System.out.print("Toplam mesai saatiniz: ");
        mesSaatiSayi = in.nextInt();


        //Gelir Hesaplama
        mesUcreti= (brutMaas / 160) * mesSaatiSayi * MESAI_UCRET_ORANI;
        toplamGelir= brutMaas + mesUcreti;

        //Kesinti Hesaplama
        sgk = toplamGelir * SGK_ORANI;
        gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        toplamKesinti = sgk + gelirVergisi + damgaVergisi;

        //Net Maaş Hesaplama
        netMaas = toplamGelir - toplamKesinti;

        //İstatislik Hesaplama

            // kesinti oranı (%)
        kesintiOrani = (toplamKesinti / toplamGelir) * 100;
            //saatlik net kazanç
        saatlikNetKazanc = netMaas / (22 * gunCalismaSaati) ;// 22 gün x 8 saat =176 saat/ay
            //günlük ne kazanç
        gunNetKazanc=netMaas / 22;//gün

        clear();

        // MAAS BORDROSU ÇIKTISI
        /**
         *
         * %15.2f  sol taraftan 15 karakterlik boşluk bırakır ve sayıya içerisinde bulunan karakterleride dahil eder, .2f virgülden sonra ilk iki rakamıni alır
         * @printf
         * her % işareti bir parametreye denk gelir ve sırasına göre eşleşme yapar
         * url:https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/How-to-use-Java-printf-to-format-output
         */
        System.out.println("====================================");
        System.out.println("            MAAS BORDROSU           ");
        System.out.println("====================================");
        System.out.println("Calisan :" + calAd +" "+ calSoyad+"\n");

        System.out.println("GELIRLER:");
        System.out.printf("   Brut Maas                 : %15.2f TL\n",brutMaas);
        System.out.printf("   Mesai Ucreti              : %15.2f TL\n",mesUcreti);

        System.out.println("  ------------------------");
        System.out.printf("   TOPLAM GELIR              : %15.2f TL\n",toplamGelir);
        System.out.println("KESINTILER:");
        System.out.printf("    SGK Kesintisi (%2d%%)      : %15.2f TL\n",Math.round(SGK_ORANI*100),sgk);
        System.out.printf("    Gelir Vergisi (%2d%%)      : %15.2f TL\n",Math.round(GELIR_VERGISI_ORANI*100),gelirVergisi);
        System.out.printf("    Damga Vergisi (%.2f%%)    : %15.2f TL\n" ,DAMGA_VERGISI_ORANI*100,damgaVergisi);
        System.out.println("    ------------------------");
        System.out.printf("    TOPLAM KESINTI           : %15.2f TL\n",toplamKesinti);
        System.out.printf("NET MAAS                     : %15.2f TL\n",netMaas);
        System.out.println("====================================");

        System.out.println("EKSTRA DETAY:");
        System.out.printf("    Kesinti Orani            : %15.2f %%\n",kesintiOrani);
        System.out.printf("    Saatlik Net Kazanc       : %15.2f TL\n",saatlikNetKazanc);
        System.out.printf("    Gunluk Net Kazanc        : %15.2f TL\n",gunNetKazanc);
        System.out.println("====================================");

        in.close();

    }
    public static void clear(){
        for(int i =0;i<50;i++){
            System.out.println();
        }
    }
}
