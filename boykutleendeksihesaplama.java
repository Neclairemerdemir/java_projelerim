// boy kütle endeksi hesaplayan uygulama 
import java.util.Scanner;

public class boykutle {
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        System.out.println("Boy-kütle endeksi (VKİ) hesaplama uygulamasina hoşgeldiniz !");
        System.out.println("Lütfen kilonuzu giriniz:");
        double kilo = girdi.nextDouble();
        System.out.println("Lütfen boyunuzu giriniz (Örneğin; 1,70 gibi):");
        double boy = girdi.nextDouble();
        double VKİ = kilo /(boy*boy);
          
         System.out.printf("VKİ = %.2f \n",VKİ);
        if (VKİ <18.5){
            System.out.println("Kilo tipiniz: ZAYIF");
        }
        else if (18.5< VKİ && VKİ <24.9) {
            System.out.println("Kilo tipiniz : SAĞLIKLI");
        }
        else if (25<VKİ && VKİ<29.9){
            System.out.println("Kilo tipiniz : ŞİŞMAN");
        }
        else if (30<VKİ && VKİ<39.9){
            System.out.println("Kilo tipiniz: OBEZ ");
        }
        else if (VKİ>40){
            System.out.println("Kilo tipiniz: AŞIRI OBEZ ");
        }
        girdi.close();
    }
}
