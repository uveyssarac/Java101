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

        if(userName.equals(correctUsername) && password.equals(correctPassword)){   // Kullanıcı adı ve şifre kontrolü
            System.out.println("Giriş yaptınız");        // Kullanıcı adı ve şifre doğruysa giriş yapılır.
        }else if(!(password.equals("dev"))){             // Hatalı şifre kontrolü
            System.out.println("Şifreniz hatalıdır.\nŞifrenizi değiştirmek ister misiniz? evet/hayır ");
            String result = inp.nextLine(); //Şifreyi değiştirmek istediği sorulur

            if(result.equals("evet")){              // Değiştirmek istiyorsa eski şifre ile aynı olup olmadığı kontrol edilir
                System.out.println("Yeni şifrenizi giriniz.");
                String newPassword = inp.nextLine();
                if(newPassword.equals(correctPassword)){
                    System.out.println("Eski şifreniz ile yeni şifreniz aynı olamaz :)");
                }else{              // Eski şifre ile yeni şifre aynı değil ise değiştirilir
                    correctPassword=newPassword;
                    System.out.println("Yeni şifre başarıyla oluşturuldu");
                }
            }else{
                System.out.println("Şifre değiştirilmek istenmedi.");
            }
        }else {     // Kullanıcı adı ve şifre hatalıysa ayrıca şifreyi de değiştirmek istemiyorsa bu sonuç döndürülür
            System.out.println("Kullanıcı adı veya şifre yanlış olduğu için giriş yapılamadı.");
        }
    }
}