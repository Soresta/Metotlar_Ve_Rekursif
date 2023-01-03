public class s14 {
    //kendisine parametre olarak gelen iki stringten büyük olanı geri dnödüren methodu yazınız.

    public static String buyukStr(String cumle1, String cumle2) {
        int uzunluk1 = 0, uzunluk2 = 0, enbuyuk = 0;
        for (int i = 0; i < cumle1.length(); i++) {
            uzunluk1++;
        }
        for (int i = 0; i < cumle2.length(); i++) {
            uzunluk2++;
        }
        if (uzunluk1 > uzunluk2) return cumle1;
        else return cumle2;
    }

    public static void main(String[] args) {
        System.out.println(buyukStr("Sorest", "Macbanner"));
    }
}
