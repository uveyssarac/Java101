import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");         // data from user
        int number = scan.nextInt();
        int sum=0;
        while (number%2==0){
            sum+=number;
            number= scan.nextInt();
        }
        System.out.println(sum);
    }
}