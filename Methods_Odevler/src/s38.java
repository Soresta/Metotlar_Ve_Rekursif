import java.util.Arrays;

public class s38 {
    //kendisine parametre olarak gelen tek boyutlu 2 dizinin toplamını geri döndüren metodu yazınız.

    public static int[] toplamD(int[] dizi1, int[] dizi2) {
        int toplam = 0;
        int[] toplamS = new int[dizi1.length];

        for (int i = 0; i < dizi1.length; i++) {
            toplam += dizi1[i] + dizi2[i];
            toplamS[i] = toplam;
        }
        return toplamS;
    }

    public static void main(String[] args) {
        int[] dizi1 = {1, 3, 6, 8, 11};
        int[] dizi2 = {3, 5, 7, 11, 41};
        System.out.println(Arrays.toString(toplamD(dizi1, dizi2)));
    }
}
