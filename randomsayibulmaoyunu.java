// random sayi tahmin oyunu 
import java.util.Random;
import java.util.Scanner;
public class kod2 {
    public static void main(String[] args) {
        Random rastgele=new Random();
        Scanner girdi= new Scanner(System.in);
        int tahmin=0,deneme=0;

        System.out.println("bilgisayar sayi tahmininde bulunuyor:");
        System.err.println("aradiğiniz sayi 0 ile 50 arasindadir. Başarilar !!");
        int randomSayi=rastgele.nextInt(50)+1;
       
         while(randomSayi!=tahmin){
            System.out.println("tahmininizi girin:");
            tahmin=girdi.nextInt();
            deneme++;
          if (randomSayi>tahmin){
            System.out.println("daha büyük bir sayi giriniz:");
          }
          else 
            System.out.println("daha küçük bir sayi giriniz:");
                   
}
 System.out.println("tebrikler sayiyi"+deneme+"seferde buldunuz :))");
   girdi.close(); 
}
    
}
