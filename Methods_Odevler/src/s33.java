public class s33 {
    //kendisine parametre olarak gelen tamsayının asal olup olmadığını geri döndüren methodu yazınız.

    public static boolean asalMi(int sayi) {
        boolean asal = true;
        for (int i = 2; i < sayi; i++) {
            if ((sayi % i) == 0) {
                asal = false;
                break;
            }
        }
        return asal;
    }

    public static void main(String[] args) {
        int sayi = 30;
        if (asalMi(sayi)) System.out.println(sayi + ". Sayısı Asal sayıdır!");
        else System.out.println(sayi + ". Sayısı Asal sayı değildir!");
    }
}
