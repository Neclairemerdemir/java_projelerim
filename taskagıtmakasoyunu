// tas-kagıt-makas oyunu

import java.util.Random;
import java.util.Scanner;

public class taskagıtmakasoyunu {
    
    public static void main(String[] args) {
        Random rastgele=new Random();
        Scanner girdi=new Scanner(System.in);
        int bilg=0, kullan=0;
        int tahmin=0;

        System.out.println("Tas-Kagit-Makas oyununa hoşgeldiniz:");
        System.out.println("3 puan toplayan kazanir... Başarilarrr !! :)");
        int randomSayi = rastgele.nextInt(3)+1;

        while (bilg<3 && kullan<3){
            System.out.println("Tas için 1'i Kagit için 2'yi ve Makas için 3'ü seçiniz: ");
             tahmin = girdi.nextInt();

            if (randomSayi== 1 && tahmin== 2 || randomSayi==3 && tahmin==2 || randomSayi==1 && tahmin ==3){
                System.out.println("Bu turu kazandiniz !!! ");
                kullan++;
            }
            else if (randomSayi== tahmin)
                System.out.println("Berabere");

            else{
                System.out.println("Bu turu bilgisayar kazandi");
                bilg++;
            }
        }
            if (kullan==3 ){
                System.out.println("TEBRİKLERR ! OYUNU KAZANDINIZ ! :)");
            }
            else {
                System.out.println("OYUNU BİLGİSAYAR KAZANDII :)");
            }
                       
        
        girdi.close();
    }
}
