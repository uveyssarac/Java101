import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        String correctUsername="patika", correctPassword="dev";
        Scanner inp = new Scanner(System.in);
        System.out.println("Kullanıcı adı giriniz : "); // Username'i kullanıcıdan alma
        userName = inp.nextLine();

        System.out.println("Şifrenizi giriniz : "); // Şifreyi kullanıcıdan alma
        password = inp.nextLine();

        if(userName.equals(correctUsername) && password.equals(correctPassword)){
            System.out.println("Giriş yaptınız");
        }else if(!(password.equals("dev"))){
            System.out.println("Şifreniz hatalıdır.\nŞifrenizi değiştirmek ister misiniz? evet/hayır ");
            String result = inp.nextLine();
            if(result.equals("evet")){
                System.out.println("Yeni şifrenizi giriniz.");
                String newPassword = inp.nextLine();
                if(newPassword.equals(correctPassword)){
                    System.out.println("Eski şifreniz ile yeni şifreniz aynı olamaz :)");
                }else{
                    correctPassword=newPassword;
                    System.out.println("Yeni şifre başarıyla oluşturuldu");
                }
            }else{
                System.out.println("Şifre değiştirilmek istenmedi.");
            }
        }else {
            System.out.println("Kullanıcı adı veya şifre yanlış olduğu için giriş yapılamadı.");
        }
    }
}