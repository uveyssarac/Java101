import java.util.Scanner;

public class Main {
    public static void pattern(int number, int counter, boolean flag){
        if(number<=0)
            flag = false;
        System.out.print(number + " ");

        if(flag){
            pattern(number - 5, counter + 1, flag);
        } else{
            if(counter == 0)
                return;
            pattern(number + 5, counter - 1, flag);
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("N Sayisi: ");
        int N = input.nextInt();
        System.out.print("Çiktisi: ");
        pattern(N, 0, true);
    }
}