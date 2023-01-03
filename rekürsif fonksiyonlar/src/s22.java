import java.util.Scanner;

public class s22 {
    //kendisine parametre olarak gelen n fibonacci tam sayısına kadar olan fibonacci sayılarılarının toplamını
    //hesaplayan rekürsif fonksiyonu yazınız.

    public static int fib(int sayi, int birinci, int ikinci) {
        if (sayi == 1) return 1;
        else return birinci + ikinci + fib(sayi - 1, ikinci, birinci + ikinci);
    }

    public static void main(String[] args) {
        int sayi = 12;
        System.out.println("Fibonacci serisinin girilen sayıya kadar toplamı = " + fib(sayi, 0, 1));
    }
}
