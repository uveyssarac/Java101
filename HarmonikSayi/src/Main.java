import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N sayısını giriniz : ");         // data from user
        int number = scan.nextInt();
        float sum=0f;
        for (int i = 1; i <= number; i++) {
            sum+=1/(float)i;
        }
        System.out.println(sum);
    }
}