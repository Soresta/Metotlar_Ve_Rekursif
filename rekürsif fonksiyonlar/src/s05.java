public class s5 {
    //kendisine parametre olarak gelen tamsayı kadar adınızı ekrana yazan rekürsif fonksiyonu yazınız.
    public static void adYaz(String ad, int sayi) {
        if (sayi > 0) {
            System.out.println(ad);
            adYaz(ad, sayi - 1);
        }
    }

    public static void main(String[] args) {
        adYaz("akif", 9);
    }
}
