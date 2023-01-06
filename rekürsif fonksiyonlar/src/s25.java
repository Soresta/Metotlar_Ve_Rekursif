import java.util.Random;

public class s25 {
    //8 dijitlik 200 adet oluşturulan şifrede birbirine eşit olmamasını sağlayan programı metot
    // kullanarak gerçekleştiriniz alfabesi sadece rakamlardan oluşmaktadır.(Sürekli karşılaştırma yapacak.).

    public static int[] dizi100() {
        int[] dizi = new int[200];
        Random random = new Random();
        for (int i = 0; i < 200; i++) {
            int sayi = random.nextInt(11111111,99999999);
            for (int j = 0; j < i; j++) {
                if (sayi == dizi[j]) {
                    sayi = random.nextInt(11111111,99999999);
                    j = -1;
                }
            }
            dizi[i] = sayi;
        } return dizi;
    }

    public static void main(String[] args) {
        int[] sonucDizi = dizi100();
        for (int i = 0; i < sonucDizi.length; i++) {
            System.out.println(sonucDizi[i]);
        }
    }
}
