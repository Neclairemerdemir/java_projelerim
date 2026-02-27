//arkadaş sayı kontrolü 
/* arkadaş sayılar iki sayı birbirinin kendisi hariç 
bölenleri toplamına eşitse bu sayılara arkadaş sayılar denir*/
import java.util.Scanner;

public class arkadassayi{
    public static void main(String[] args) {
        int sayi1,sayi2 ,top1=0,top2=0;
        Scanner girdi = new Scanner(System.in);
        System.out.println("arkadaşlığı kontrol edilecek 1. sayıyı giriniz:");
        sayi1 = girdi .nextInt();
        System.out.println("2.sayiyi giriniz:");
        sayi2 = girdi .nextInt();

        for (int i=1;i<sayi1;i++){
            if (sayi1%i==0){
                top1=top1+i;
            }
        }
        for (int j=1;j<sayi2;j++){
            if(sayi2%j==0){
                top2=top2+j;
            }
        }
        if ((top1==sayi2) && (top2==sayi1)){
            System.out.println("bu iki sayi arkadaş sayılardır.");
        }
        else 
{
    System.out.println("bu sayılar arkadaş sayılar değildir.");
}
 girdi.close();

    }
    
}
