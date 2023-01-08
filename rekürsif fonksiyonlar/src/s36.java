public class s36 {
    //kendisine parametre olarak gelen tamsayıya kadar olan asal sayıları bulan ve ekrana yazdıran rekürsif fonksiyonu yazınız.
    //Önemli not: Girilen sayı çok büyük olduğu durumda hata vericektir bu hata rekürsif kendini o kadar çok çagrıyor ki stack
    //alanımız doluyor ve crash veriyor bunu çözebilirsem güncellicem! max(151) sayısı verilebilir.

    public static String asalSayi(int sayi, int sayiyaGiden, int ikidenBaslayan, boolean cond) {
        if (sayiyaGiden == sayi) return "";
        else {
            if (ikidenBaslayan == sayiyaGiden) {
                if (cond) System.out.println(sayiyaGiden);
                return asalSayi(sayi, sayiyaGiden + 1, 2, true);
            } else if ((sayiyaGiden % ikidenBaslayan) == 0) {
                cond = false;
                return asalSayi(sayi, sayiyaGiden, ikidenBaslayan + 1, cond);
            } else return asalSayi(sayi, sayiyaGiden, ikidenBaslayan + 1, cond);
        }
    }

    public static void main(String[] args) {
        System.out.println(asalSayi(50, 2, 2, true));
    }
}
