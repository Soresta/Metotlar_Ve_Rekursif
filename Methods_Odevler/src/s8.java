public class s8 {
    //kendisine parametre olarak gelen iki tamsayıdan büyük olanı geri döndüren methodu yazınız.

    public static int buyukSayiyiBul(int sayi1, int sayi2) {
        int enBuyuk = sayi1;
        if (enBuyuk < sayi2) enBuyuk = sayi2;
        return enBuyuk;
    }

    public static void main(String[] args) {
        System.out.println("Girilen sayılardan büyük olan= " + buyukSayiyiBul(117, 0));
    }
}
