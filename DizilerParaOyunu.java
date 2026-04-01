import java.util.Random;
import java.util.Scanner;
public class DizilerParaOyunu {
    public static void main(String[] args) {
        Scanner girdi =new Scanner(System.in);
        Random rnd = new Random();
        String secim;
        int top=0, secimSayisi=0;

        int[] kutuPara = {20 ,-50 ,64 ,88,-97 ,-55 ,67,42,-89 ,-66, 32 , 65 , 87 , 98 , 99 ,37,67,-53,-99,-12};

        int secilenKutu = rnd.nextInt(20);

        do {
           
            if (kutuPara[secilenKutu]<0){
                System.out.println("-");
                secilenKutu++;
        
            }
            else {
                System.out.println("+");
                 secilenKutu++;
        }
        top += kutuPara[secilenKutu];

        System.out.println("tamam mı , devam mı??(T/D)");
        secim = girdi.nextLine();

      }while(secim.equals("D")&& secimSayisi<10);

System.out.println("oyun bitti toplam para miktarınız:"+top);

girdi.close();

    }
}
