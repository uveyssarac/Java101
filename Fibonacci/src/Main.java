import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n=sc.nextInt();
        int number1=0, number2=1, temp;

        System.out.print(number1+" "+number2+" ");

        for (int i = 0; i < n-1; i++) {
            temp=number1+number2;
            number1=number2;
            number2=temp;
            System.out.print(temp+" ");
        }

    }
}