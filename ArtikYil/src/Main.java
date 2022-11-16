import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Yıl giriniz : "); //Yıl verisini kullanıcıdan alma
        int year = inp.nextInt();

        if(year%4==0){                         // 4'e bölünmüyorsa zaten artık olamaz

            if(year%100==0 && !(year%400==0)){  //100'ün katı olup aynı zamanda 400 ün katı olmayan yıllar artık yıl değildir
                System.out.println(year+" bir artık yıl değildir.");
            }else {
                System.out.println(year+" artık yıldır.");
            }
        }else{
            System.out.println(year+" bir artık yıl değildir.");
        }


    }
}