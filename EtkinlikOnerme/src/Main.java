import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Sıcaklık değerini giriniz : "); // Sıcaklık değerini kullanıcıdan alma
        int heat = inp.nextInt();
        
        if(heat<5){         // Sıcaklık değerlerine göre kullanıcıya sonuç döndürme
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat>=5 && heat<15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (heat>=15 && heat<25) {
            System.out.println("Piknik yapabilirsiniz.");
        } else if (heat>25) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }


    }
}