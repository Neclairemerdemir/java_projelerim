import java.util.Random;
import java.util.Scanner;

public class zarAtmaOyunu {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        Random rastgele = new Random();
        int kullanSkor=0,bilgSkor=0,tur=0;

        System.out.println("Zar atma oyununa hoşgeldiniz !");
        System.out.println("1-6 arasında bir sayı giriniz:");

    do{
        tur++;
        System.out.println("tur sayısı:"+tur);

        int kullanSecim = girdi.nextInt();
        int bilgSecim = rastgele.nextInt(5)+1;

        System.out.println("Kullanıcı seçimi :"+kullanSecim);
        System.out.println("Bilgisayar seçimi:"+bilgSecim);  
        

        if (kullanSecim > bilgSecim){
            kullanSkor++;
            System.out.println("bu turu kazanan kullanıcı  Skor:\t kullanıcı "+kullanSkor+ "\t bilgisayar "+bilgSkor);
        }
        else {
            bilgSkor++;
            System.out.println("bu turu kazanan bilgisayar  Skor:\t kullanıcı "+kullanSkor+ "\t bilgisayar "+bilgSkor);
        }

}while (tur != 3 || kullanSkor==bilgSkor);
 if (kullanSkor > bilgSkor )
System.out.println("Kazanan ");
      girdi.close();
    }
}
