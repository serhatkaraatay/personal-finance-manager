import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("------ Kişisel Finans Yönetim Sistemi ------");
            System.out.println("Seçenekler");
            System.out.println("1- Gelir Ekle");
            System.out.println("2- Gider Ekle");
            System.out.println("3- Tüm işlemleri Görüntüle");
            System.out.println("4- Çıkış");
            System.out.print("Seçiminiz : ");
            int secim = scanner.nextInt();
            scanner.nextLine();
            if(secim == 1){
                System.out.println("Gelir Ekleme Seçildi");
            }
            else if(secim == 2){
                System.out.println("Gider Ekleme Seçildi");
            }
            else if(secim == 3){
                System.out.println("Tüm işlemleri Görüntüle Seçildi");
            }
            else if (secim == 4){
                System.out.println("Program sonlandırıldı");
                break;
            }
            else{
                System.out.println("Hatalı bir seçim yaptınız");
            }

        }
        scanner.close();
    }
}
