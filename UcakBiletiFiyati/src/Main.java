import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Mesafe (KM) : ");
        int distance = inp.nextInt();           // Mesafe bilgisini alma

        System.out.println("Yaşınızı giriniz : "); // Yaş bilgisini alma
        int age = inp.nextInt();

        System.out.println("Tek yön için : 1, Gidiş dönüş için : 2, değerini giriniz  : ");
        int trip = inp.nextInt();

        float kmPrice=0.10f;

        System.out.println("Normal tutar :"+distance*kmPrice);

    }
}