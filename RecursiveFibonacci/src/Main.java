import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num;
        // create scanner
        Scanner scr = new Scanner(System.in);
        // data from user
        System.out.println("Enter your number.");
        num = scr.nextInt();
        // print first 2 numbers
        System.out.print("0 " + "\t" + "1 ");
        // print others
        fibo(num - 2);

    }
    static int num1 = 0, num2 = 1, num3 = 0;

    public static void fibo(int num) {

        if (num > 0) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print("\t" + num3);
            fibo(num - 1);

        }

    }
}

