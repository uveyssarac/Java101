import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);
        String usurname,password;
        int balance = 2000;
        int soul = 3;
        int select ;

        while (soul > 0){
            System.out.print("Kullanici adi : ");
            usurname=data.nextLine();
            System.out.print("Sifre : ");
            password=data.nextLine();


            if (usurname.equals("Uveys") && (password.equals("Sarac"))){
                System.out.println("Sisteme giris yapildi..");
                System.out.println("1-Bakiye \n2-Para yatirma \n3-Para cekme \n4-Cikis yap ");
                System.out.println("Lutfen yapmak istediginiz islemi saciniz : ");
                select=data.nextInt();
                switch (select){
                    case 1:
                        System.out.print("Toplam Bakiyeniz : "+balance);
                        break;
                    case 2:
                        System.out.print("Yatirilacak para miktarini giriniz : ");
                        int price=data.nextInt();
                        balance+=price;
                        System.out.println("Guncel Bakiyeniz : "+balance);
                        break;
                    case 3:
                        System.out.print("Cekmek istediginiz miktari giriniz: ");
                        price = data.nextInt();

                        if (price > balance){
                            System.out.print("Yetersiz Bakiye");
                        }else{
                            balance-=price;
                            System.out.print("Guncel Bakiyeniz : "+balance);
                            break;
                        }
                    case 4:
                        System.out.print("Iyi gunlerde kalin!!!");
                        break;
                }
                break;
            }
            else {
                soul--;
                System.out.println("Kullanici adi veya sifre yanlis..");
                System.out.println("Kalan Hakkiniz : "+soul);
                if (soul==0){
                    System.out.println("Hesabiniz bloke edilmistir.");
                }

            }

        }

    }
}