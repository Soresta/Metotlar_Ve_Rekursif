public class s2 {
    //Kendisine parametre olarak gelen pozitif tamsayıya kadar olan sayıların toplamını
    //hesaplayan rekürsif fonksiyonu yazınız.
    public static int toplama(int sayi) {
        if (sayi == 1) return 1;
        else return sayi + toplama(sayi - 1);
    }

    public static void main(String[] args) {
        System.out.println(toplama(5));
    }
}
