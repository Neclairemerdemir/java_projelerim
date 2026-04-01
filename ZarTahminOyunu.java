import java.util.Random;
import java.util.Scanner;
public class ZarTahminOyunu {
    public static void main(String[] args) {
         Random rnd =new Random();
         Scanner giris =new Scanner(System.in);
         int kulSec,bilgSec,kulSkor=0,bilgSkor=0,tur=0;
         do{
            System.out.println("1-6 arasında seçim yapınız:");
            kulSec=giris.nextInt();
            bilgSec=rnd.nextInt(6)+1;
            System.out.println("secim="+kulSec+"\n bilgisayar="+bilgSec);
            tur++;
            if (kulSec<bilgSec){
                bilgSkor++;
                System.out.println("Sonuç: Bilgisayar kazandı Puanlar=Bilgisayar:"+bilgSkor+"kullanıcı :"+kulSkor);
            }
            else if (kulSec>bilgSec){
                kulSkor++;
                System.out.println("Sonuç: Siz kazandı Puanlar=Bilgisayar:"+bilgSkor+"\tkullanıcı :"+kulSkor);
            }
            else {
                System.out.println("Berabere kaldınız");
                 tur--;
        }         
         }while(tur<3);

         if (kulSkor<bilgSkor){
            System.out.println("Kazanan kullanıcı...");
         }
         else if(kulSkor>bilgSkor){
            System.out.println("Kazanan bilgisayar...");
         }
         else {
            System.out.println("berabere kaldınız...");
         }
         giris.close();

    }
}
