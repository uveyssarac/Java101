import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz: ");
        int n = inp.nextInt();
        int number, max=0,min=0;
        for (int i = 1; i <= n; i++) {
            System.out.println(i+". sayıyı giriniz");
            number= inp.nextInt();
            if(number>max){
                max=number;
            }
            if(number<min){
                min=number;
            }
        }
        System.out.println("En büyük sayı: "+max);
        System.out.println("En küçük sayı: "+min);

    }
}