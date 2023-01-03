import java.util.Scanner;

public class S4 {
    //kendisine parametre olarak gelen pozitif tamsayının kaç basamaklı olduğunu geri döndüren method yazınız.

    public static int kacBasamak(int sayi) {
        int basamak = 0;
        while (sayi > 0) {
            sayi = sayi / 10;
            basamak++;
        }
        return basamak;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Pozitif bir tamsayı giriniz: ");
        int sayi = read.nextInt();
        System.out.println(sayi + " sayısı: " + kacBasamak(sayi) + " Basamaklı");
    }
}
