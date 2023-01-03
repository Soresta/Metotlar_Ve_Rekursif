import java.util.Scanner;

public class s3 {
    //kendisine parametre olarak gelen n tamsayısı kadar adınızı ekrana yazan method yazınız.

    public static void adYazdir(String ad, int kacKere) {
        for (int i = 0; i < kacKere; i++) {
            System.out.println(i + 1 + ".kere :" + ad);
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Adınızı giriniz: ");

        String ad = read.nextLine();
        System.out.print("Adınızı kaç kere yazdırmak istersiniz: ");

        int kacKere = read.nextInt();
        adYazdir(ad, kacKere);
    }
}
