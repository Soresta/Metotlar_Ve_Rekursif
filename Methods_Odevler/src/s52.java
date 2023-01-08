public class s52 {
    //kendisine parametre olarak geln tamsayıya kadar asal sayıları bulan ve ekrana yazan metodu yazınız.

    public static void asalBul(int sayi) {
        boolean cond = true;
        for (int i = 2; i < sayi; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) cond = false;
            }
            if (cond) System.out.println(i);
            cond = true;
        }
    }

    public static void main(String[] args) {
        asalBul(483);
    }
}
