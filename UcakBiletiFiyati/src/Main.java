import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Mesafe (KM) : ");
        int distance = inp.nextInt();           // Mesafe bilgisini alma

        System.out.println("Yaşınızı giriniz : "); // Yaş bilgisini alma
        int age = inp.nextInt();

        System.out.println("Tek yön mü, Gidiş-dönüş mü? (ty/gd) : ");
        int trip = inp.nextInt();

    }
}