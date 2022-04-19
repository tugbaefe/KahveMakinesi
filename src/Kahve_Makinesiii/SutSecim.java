package Kahve_Makinesiii;

import static Kahve_Makinesiii.Giris.scan;
import static Kahve_Makinesiii.Giris.sutTercih;

public class SutSecim {

    public static void sutSecim(){
        System.out.println("***************");
        System.out.println("Süt eklememizi ister misiniz ?");
        System.out.println("Tercihinizi evet/hayir olarak yapiniz");
        sutTercih=scan.next();

        if (sutTercih.equalsIgnoreCase("evet")){
            System.out.println("Kahvenize Süt ekleniyor...");

        }else if (sutTercih.equalsIgnoreCase("hayir")){
            System.out.println("Kahvenize sut eklenmeyecek...");
        }else{
            System.out.println("Hatali giris yaptiniz.Sorunsuz bir kahve icin yonergeleri takip edin");
            sutSecim();
        }


    }
}
