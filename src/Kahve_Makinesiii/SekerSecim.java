package Kahve_Makinesiii;

import static Kahve_Makinesiii.Giris.scan;

public class SekerSecim {

    public static void sekerSecim(){
        System.out.println("***************");
        System.out.println("Kahvenize seker eklememizi ister misiniz?");
        System.out.println("Tercihinizi evet/hayir seklinde yapiniz");
        String sekerTercih=scan.next();

        if (sekerTercih.equalsIgnoreCase("evet")){
            System.out.println("Kahvenize kac adet seker eklememizi istersiniz?");
            int kacSeker= scan.nextInt();
            System.out.println("Kahvenize "+kacSeker+ " adet seker ekleniyor.");

        }else if (sekerTercih.equalsIgnoreCase("hayir")){
            System.out.println("Kahvenize seker eklenmeyecek...");
        }else{
            System.out.println("Hatali giris yaptiniz...Tercihinizi yonergelere gore yapiniz");
            sekerSecim();
        }
    }
}

