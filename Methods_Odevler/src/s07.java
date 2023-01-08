public class s7 {
    //kendisine parametre olarak gelen pozitif tamsayıya kadarki tüm pozitif
    //tamsayıları toplayıp geri döndüren methodu yazınız.

    public static int pozitifToplam(int sayi) {
        int toplam = 0;
        for (int i = sayi-1; i > 0; i--) {
            toplam += i;
        }
        return toplam;
    }

    public static void main(String[] args) {
        System.out.println("Pozitif tamsayıların toplamı = " + pozitifToplam(6));
    }
}
