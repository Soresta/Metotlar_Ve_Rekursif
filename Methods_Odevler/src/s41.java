import java.util.Scanner;

public class s41 {
    //kullanıcı tarafında girilen bir sayının basamaklarının toplamını hesaplayan methodu yazınız.

    public static int topBasamak(int sayi) {
        int toplam = 0;
        while (sayi != 0) {
            toplam += sayi % 10;
            sayi /= 10;
        }
        return toplam;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = read.nextInt();
        System.out.println(sayi + ". Sayısının basamak değerlerinin toplamı = " + topBasamak(sayi));
    }
}
