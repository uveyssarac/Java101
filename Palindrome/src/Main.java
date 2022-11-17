import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayıyı giriniz : ");         // data from user
        int number = scan.nextInt();

        System.out.println(isPalindrom(number));

    }
    public static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        if(number == reverseNumber){
            return true;
        }else{
            return false;
        }
    }
}