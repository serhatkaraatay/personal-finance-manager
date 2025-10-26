import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> gelirListesi= new ArrayList<String>();
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
                System.out.println("Gelir Miktarını Giriniz: ");
                double gelir_miktar = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Gelir Türünü Giriniz (örn: maaş, harçlık) : ");
                String gelir_turu =  scanner.nextLine();
                String gelir = gelir_turu + " - " +  gelir_miktar + " TL";
                gelirListesi.add(gelir);
            }
            else if(secim == 2){
                System.out.println("Gider Ekleme Seçildi");
            }
            else if(secim == 3){
                if(gelirListesi.isEmpty()){
                    System.out.println("Gelir Listesi Şu An Boş! ");
                }
                else {
                    for(String gelir : gelirListesi){
                        System.out.println(gelir);
                    }
                }
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
