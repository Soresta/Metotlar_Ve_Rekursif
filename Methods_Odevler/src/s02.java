import java.util.Scanner;

public class s2 {
    //kendisine parametre olarak gelen 2 tamsayının a üssü b'sini hesaplayıp geri döndüren method yazınız.

    public static int usAlma(int taban, int us) {
        int sonuc = 1;
        for (int i = 0; i < us; i++) {
            sonuc *= taban;
        }
        return sonuc;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        int taban = read.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int us = read.nextInt();
        System.out.println(taban + "^" + us + " = " + usAlma(taban, us));
    }
}
