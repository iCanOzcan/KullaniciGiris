import java.util.Scanner;
public class KullaniciGirisi {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String userName,password,newPass;

        System.out.print("Kullanici adini giriniz :");
        userName=input.nextLine();
        System.out.print("Parolayı giriniz :");
        password=input.nextLine();

        if(userName.equals("kullanici1") && password.equals("1234"))
        {
            System.out.println("Basari ile giris yaptiniz.");
        }
        else{
            System.out.println("Hatali giris yaptiniz.");
            System.out.println("Sifrenizi sifirlamak ister misiniz?   Evet icin 'E'/Hayir icin 'H' harfine basiniz. ");
            String cevap =input.nextLine();
            if(cevap.equals("E"))
            {
                 System.out.print("Yeni sifrenizi giriniz :");
                 newPass = input.nextLine();
                if (newPass.equals("1234"))
                {
                    System.out.println("Sifre olusturulamadi, lütfen baska sifre giriniz.");
                }
                else
                {
                    System.out.println("Sifre olusturuldu.");
                    password=newPass;
                    System.out.println("yeni sifreniz :"+ password);
                }
            }
            else if (cevap.equals("H"))
            {
                System.out.println("Lutfen tekrar deneyin !");

            }
            else {
                System.out.println("Hatali tuslama yaptiniz.");
            }

        }
    }

}
