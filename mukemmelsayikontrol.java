// btk mükemmel sayı bulma 
import java.util.Scanner;

public class mukemmelsayi {
    public static void main(String[] args) {
        int sayi , top=0 ,i;
        Scanner girdi = new Scanner(System.in);
         
        System.out.println(" sayiyi giriniz:");
        sayi = girdi.nextInt();

         for(i=1;i<sayi;i++){
            if (sayi % i ==0 ){
                top=top+i;
            }  }
            if (top == sayi){
                System.out.println("girilen sayi mükemmel sayidir.");
            }
            else{
                System.out.println("girilen sayi mükemmel sayidir.");
            }
         
         girdi.close();

    }
    
}
