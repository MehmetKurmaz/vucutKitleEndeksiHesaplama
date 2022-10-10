import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy,kilo,kitle;
        System.out.print("Kilonuzu Giriniz :");
        Scanner input=new Scanner(System.in);
        kilo= input.nextDouble();
        System.out.print("Boyunuzu Giriniz :");
        boy=input.nextDouble();
        kitle=kilo/(boy*boy);
        System.out.println("Kilonuz :"+kilo);
        System.out.println("Boyunuz :"+boy);
        System.out.println("Vucut Kitle indeksiniz :"+kitle);
    }
}