//uygulama giriş ekranı 
import java.util.Scanner;

public class uygulamagiris {
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        long sifre ,kayitlisifre=12345678L;
        String mail,kayitliMail="bilgisayarmuh32@gmail.com";
        System.out.println("Uygulamamıza hoşgeldiniz giriş yapmak için mailinizi giriniz:");
         mail =girdi.nextLine().trim();  //nextLine() nın amacı boşluk karmaşasını önlemek  //trim()ise yanlışıkla koyulan boşlukları silmek için
        System.out.println("sifrenizi giriniz:");
        sifre =girdi.nextLong();

        if ((kayitliMail.equals(mail))&&(kayitlisifre==sifre)){
            System.out.println(" giriş onaylandı");
        }
        else {
            System.out.println("giriş başarısız!!");
        }
       girdi.close();


        
    }
}
