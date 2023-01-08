public class s3 {
    //Kendisine parametre olarak gelen sayının kaç basamaklı olduğunu hesaplayan rekürsif fonksiyonu yazınız.
    public static int basamak(int sayi) {
        if (sayi == 0) return 0;
        else return 1 + basamak(sayi / 10);
    }

    public static void main(String[] args) {
        System.out.println(basamak(9));
    }
}
