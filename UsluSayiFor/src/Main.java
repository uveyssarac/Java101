import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");         // data from user
        int taban = scan.nextInt();
        System.out.print("Üs değerini giriniz : ");         // data from user
        int us = scan.nextInt();
        int sum=1;
        for (int i = 0; i < us; i++) {
           sum=sum*taban;
        }
        System.out.println(sum);
    }
}