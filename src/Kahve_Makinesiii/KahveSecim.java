package Kahve_Makinesiii;

import static Kahve_Makinesiii.Giris.kahveIsmi;
import static Kahve_Makinesiii.Giris.scan;

public class KahveSecim {


    public static void kahveSecim(){

        System.out.println("Hangi kahveyi icersiniz? ");
        System.out.println("1.Turk Kahvesi \n2.Espresso \n3.Filtre Kahve");
        int secim=scan.nextInt();

        switch (secim) {
            case 1:
                System.out.println(kahveIsmi = "Turk Kahvesi");
                break;
            case 2:
                System.out.println(kahveIsmi = "Espresso");
                break;
            case 3:
                System.out.println(kahveIsmi = "Filtre Kahve");
                break;
            default:
                System.out.println("Hatali Giris yaptiniz. Tekrar deneyiniz.");
                kahveSecim();
        }
                if (kahveIsmi.equalsIgnoreCase("Turk Kahvesi")){
                    System.out.println("Türk kahvesi hazırlanıyor...");

                }else if (kahveIsmi.equalsIgnoreCase("Espresso")){
                    System.out.println("Espresso kahveniz hazirlaniyor ");
                }else if (kahveIsmi.equalsIgnoreCase("Filtre Kahve")){
                    System.out.println("Filtre kahveniz hazirlaniyor ");

                }else{
                    System.out.println("Hatali giris, seciminizi gozden geciriniz");
                    kahveSecim();
                }


    }


}
