import java.util.Arrays;

public class s37 {
    //kendisine parametre olarak gelen iki dizinin her bir indisinde ki büyük sayıyı dödnüren methodu yazınız.
    public static int[] buyukolan(int[] dizi1, int[] dizi2) {
        int[] sonuc = new int[dizi1.length];
        for (int i = 0; i < dizi1.length; i++) {
            if (dizi1[i] > dizi2[i]) sonuc[i] = dizi1[i];
            else sonuc[i] = dizi2[i];
        }
        return sonuc;
    }

    public static void main(String[] args) {
        int[] dizi1 = {1, 3, 5, 7, 9, 3, 64, 2};
        int[] dizi2 = {7, 4, 6, 1, 3, 7, 34, 11};
        int[] sonuc = buyukolan(dizi1, dizi2);
        for (int i = 0; i < sonuc.length; i++) {

        }
    }
}
