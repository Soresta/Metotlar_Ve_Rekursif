import java.util.Scanner;

public class s5 {
    //n. fibonacci sayısını geri döndüren methodu yazınız.

    public static int fibonacci(int n) {
        int sayi1 = 0, sayi2 = 1, toplam = 0;

        for (int i = 1; i < n; i++) {
            toplam = sayi1 + sayi2;
            sayi1 = sayi2;
            sayi2 = toplam;
        }
        return toplam;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("n değerini giriniz: ");
        int n = read.nextInt();
        System.out.println("Fibonacci serisinin " + n + ".elemanı = " + fibonacci(n));
    }
}
