import java.util.Scanner;

public class formulluToplam {
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        int n;
        double top=0;

        System.out.println("1'den kaça kadar toplanması istenen sayıyı yazınız:");
        n = girdi.nextInt();

        if (n<0){
            System.out.println("işlem yapılamaz tekrar giriniz:");
        }
        else {
            for(int i=1;i<n;i++){
            top =top + (2*i+1)/(i*i+2);
        }
        System.out.println("toplamı:"+top);
    }
    girdi.close();
    }
}
