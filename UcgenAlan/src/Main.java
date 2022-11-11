import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp= new Scanner(System.in);
        System.out.println("1. kenar uzunluğunu giriniz : ");
        int a= inp.nextInt();
        System.out.println("2. kenar uzunluğunu giriniz : ");
        int b= inp.nextInt();
        System.out.println("3. kenar uzunluğunu giriniz : ");
        int c= inp.nextInt();
        double u=(a+b+c)/2;
        //double hipo= Math.sqrt((a*a)+(b*b));
        double alan=Math.sqrt( u*(u-a)*(u-b)*(u-c));


        System.out.println(alan);
    }
}