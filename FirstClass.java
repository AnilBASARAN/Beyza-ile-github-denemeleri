import java.util.Scanner;

public class FirstClass {
    public static void main(String[]args){
            Scanner input = new Scanner(System.in);
            String kullaniciAdi = "Anil Basaran";
            String sifre = "password123";

            System.out.print("Kullanıcı Adınızı Girin: ");
            String kullaniciAdiGirdi = input.nextLine();

            System.out.print("Şifrenizi Girin: ");
            String sifreGirdi = input.nextLine();

            if (kullaniciAdi.equals(kullaniciAdiGirdi) && sifre.equals(sifreGirdi)){
                System.out.println("Hoşgeldiniz, " + kullaniciAdi );
            }else if(kullaniciAdi.equals(kullaniciAdiGirdi)){
                System.out.print( kullaniciAdi + " şifrenizi hatalı girdiniz. Şifrenizi sıfırlamak ister misiniz? (E/H): ");
                String karar = input.nextLine();
                if(karar.equals("E")){
                    System.out.println("Yeni şifreniz eski şifrenizle aynı olmamalıdır.");
                    System.out.print("Yeni şifrenizi girin: ");
                    String yeniSifre = input.nextLine();
                    if( yeniSifre != sifre ){
                        System.out.print("Yeni şifreniz başarılıyla oluşturuldu.");
                    }else if(yeniSifre == sifre ){
                        System.out.println("Yeni şifreniz eski şifrenizle aynı olmamalıdır.");
                        System.out.println("Çıkış yapıldı");
                    }
                }else if(karar == "H") {
                    System.out.println("Çıkış yapıldı");
                }
            }else if(sifre != sifreGirdi){
                System.out.println("Kullanıcı adınızı ve şifrenizi hatalı girdiniz");
                System.out.println("Çıkış yapıldı");
            }
    }
}
