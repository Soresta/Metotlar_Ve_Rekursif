public class s6 {
    //kendisine parametre olarak gelen n tamsayısına karşılık fibonacci sayısını
    //hesaplayan rekürsif fonksiyonu yazınız.

    public static int fib(int sayi) {
        if (sayi <= 2) return 1;
        else return fib(sayi - 1) + fib(sayi - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(7));
    }
}
