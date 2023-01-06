import java.util.Arrays;

public class s29 {
    //10 sayı sisteminden oluşan 2 tane tamsayı dizisini toplayıp geri döndüren reküsrif fonksiyonu yazınız.

    public static int[] toplam(int[] dizi1, int[] dizi2, int sayac, int[] dizi3, int elde) {
        if (sayac != -1) {
            dizi3[sayac + 1] = dizi1[sayac] + dizi2[sayac] + elde;
            if (dizi3[sayac + 1] >= 10) {
                dizi3[sayac + 1] = dizi3[sayac + 1] - 10;
                elde = 1;
            } else elde = 0;
            return toplam(dizi1, dizi2, sayac - 1, dizi3, elde);
        } else dizi3[0] = elde;
        return dizi3;
    }

    public static void main(String[] args) {
        int[] dizi1 = {9, 3, 7, 9, 9};
        int[] dizi2 = {4, 3, 6, 9, 9};
        int[] dizi3 = new int[dizi1.length + 1];
        System.out.println(Arrays.toString(toplam(dizi1, dizi2, dizi1.length - 1, dizi3, 0)));
    }
}
