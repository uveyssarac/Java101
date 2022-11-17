import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayıyı giriniz : ");         // data from user
        int number = scan.nextInt();
        int sum=0;
        while(number >= 1){

            int lastNumber=number%10;
            sum+=lastNumber;
            number/=10;             //her defasında sayıyı 10'a bölüp sayıyın son basamağını atmış oluyoruz
        }
        System.out.println(sum);
    }
}