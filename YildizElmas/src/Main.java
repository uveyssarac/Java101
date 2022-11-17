import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N sayısını giriniz : ");         // data from user
        int number = scan.nextInt();

        for (int i = 0; i < number*2+1; i++) {

            if(i<number){
                for (int j = 0; j < number-i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2*i+1; j++) {
                    System.out.print("*");
                }
            }else{
                for (int j = 0; j < i-number; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2*(2*number-i)+1; j++) {
                    System.out.print("*");
                    //System.out.print(number);
                }
            }
            System.out.println();
        }

    }
}