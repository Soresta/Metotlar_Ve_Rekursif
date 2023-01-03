import java.util.Arrays;

public class s23 {
    //kendisine parametre olarak gelen tamsayı dizisindeki en büyük ikinci sayıyı
    //geri döndüren methodu yazınız.

    public static int iEnBuyukS(int[] dizi) {
        int enBuyuk = dizi[0];
        int ikinciEnBuyuk = dizi[1];

        if (ikinciEnBuyuk > enBuyuk) {
            int yedek = ikinciEnBuyuk;
            ikinciEnBuyuk = enBuyuk;
            enBuyuk = yedek;
        }
        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] > enBuyuk) {
                ikinciEnBuyuk = enBuyuk;
                enBuyuk = dizi[i];
            } else if (dizi[i] > ikinciEnBuyuk) ikinciEnBuyuk = dizi[i];
        }
        return ikinciEnBuyuk;
    }

    public static void main(String[] args) {
        int[] dizi = {1, 4, 5, 8, 2, 4, 6, 14};
        System.out.println(Arrays.toString(dizi) + " Dizisinde en büyük ikinci değer = " + iEnBuyukS(dizi));
    }
}
