import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");         // data from user
        int number = scan.nextInt();
        int count=0, sum=0;
        for (int i = 1; i < number; i++) {          //for loop to number from user
            if(i%3==0 && i%4==0){                   // check %3 and %4 ==0
                sum+=i;
                count++;
                //System.out.println(i);
            }
        }
        System.out.println(sum/(float)count);       //result

    }
}