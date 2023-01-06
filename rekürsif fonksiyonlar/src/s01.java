public class s1 {
    //kendisine parametre olarak gelen sayının faktöryelini hesaplayan rekürsif fonksiyonu yazınız.
    public static int fak(int sayi) {
        if (sayi <= 1) return 1;
        else return sayi * fak(sayi - 1);
    }

    public static void main(String[] args) {
        System.out.println(fak(-1));
    }
}
