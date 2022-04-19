package Kahve_Makinesiii;

import static Kahve_Makinesiii.Giris.kahveBoyut;
import static Kahve_Makinesiii.Giris.scan;

public class BoyutSecim {

    public static void kahveBoyutSecim(){
        System.out.println("***************");
        System.out.println("Lutfen kahvenizin boyutunu seciniz.");
        System.out.println("1.Kucuk Boy"+ "\n2.Orta Boy"+" \n3.Buyuk Boy");
        int boyutSecim=scan.nextInt();
        switch (boyutSecim){
            case 1:
                System.out.println(kahveBoyut = "Kucuk Boy");
                break;
            case 2:
                System.out.println(kahveBoyut = "Orta Boy");
                break;
            case 3:
                System.out.println(kahveBoyut = "Buyuk Boy");
                break;
            default:
                System.out.println("Hatali tercih");
                kahveBoyutSecim();
        }

        if (kahveBoyut.equalsIgnoreCase("Kucuk Boy")){
            System.out.println("Kahveniz " + kahveBoyut + " hazırlanıyor.");
        }else if (kahveBoyut.equalsIgnoreCase("Orta Boy")){
            System.out.println("Kahveniz " + kahveBoyut + " hazırlanıyor.");
        }else if (kahveBoyut.equalsIgnoreCase("Buyuk Boy")){
            System.out.println("Kahveniz " + kahveBoyut + " hazırlanıyor.");
        }else{
            System.out.println("Hatali tercih");
            kahveBoyutSecim();
        }

    }
}
