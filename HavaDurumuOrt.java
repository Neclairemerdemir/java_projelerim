import java.util.Scanner;
public class HavaDurumuOrt{
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        double top=0,ort =0;
        int sicaklik[] = new int[30];
        int ay;
        System.out.println("hangi ayın ortalama sıcaklık bilgisinin hesaplanacağını ayın degerini giriniz:");
        ay = girdi. nextInt();
        if (ay == 2){
            System.out.println("28 günün sıcaklık değerlerini giriniz:");
            for (int i=0;i<28;i++){
            sicaklik[i] = girdi.nextInt();
            top += sicaklik[i];
              } ort = top / 28;
            }
            else{
                System.out.println("30 günün sıcaklık değerlerini giriniz:");
                for(int j=0;j<30;j++){
                    sicaklik[j] = girdi.nextInt();
                    top +=sicaklik[j];   
                }
                ort = top / 30;
            }
            System.out.println(ay+". ayın sıcaklık ortlaması :"+ort);
            girdi.close();
    }
}
