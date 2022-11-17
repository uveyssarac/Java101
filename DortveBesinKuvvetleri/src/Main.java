import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");         // data from user
        int number = scan.nextInt();

        for (int i = 4; i < number; i*=4) {        // 4'ün karesi kadar number'a kadar ilerler ve yazdırır.
            System.out.println(i);
        }
        for (int i = 5; i < number; i*=5) {         // 5'in karesi kadar number'a kadar ilerler ve yazdırır.
            System.out.println(i);
        }
    }
}