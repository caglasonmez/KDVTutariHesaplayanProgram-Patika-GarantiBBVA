package CaglaSonmez;

import java.util.Scanner;
 public class KDVTutarıHesaplayanProgram {
     public static void main(String[] args) {
         double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;

         Scanner input = new Scanner(System.in); // Kullanıcıdan miktar girdisi alır
         System.out.println("Ücret Miktarını Giriniz : ");
         double ucretMiktari = input.nextDouble();

         //Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8
         if (ucretMiktari > 0 && ucretMiktari <= 1000) {
             kdvOran = 0.18; // KDV oranı %18
         } else {
             kdvOran = 0.08; // KDV oranı %8
         }

         double kdvSizTutar = ucretMiktari;
         kdvTutar = kdvSizTutar * kdvOran; // KDV Tutarını Hesaplar
         kdvliTutar = kdvSizTutar + kdvTutar; // KDV'li Tutarı Hesaplar

         // KDV'siz Fiyat, KDV Oranı, KDV'li Fiyat, KDV Tutarı ekrana yazdırır.
         System.out.println("KDV'siz Fiyat: " + kdvSizTutar);
         System.out.println("KDV Oranı: " + kdvOran);
         System.out.println("KDV'li Fiyat: " + kdvliTutar);
         System.out.println("KDV Tutarı: " + kdvTutar);
     }
}
