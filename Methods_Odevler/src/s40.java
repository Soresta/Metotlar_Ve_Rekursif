import java.util.Arrays;

public class s40 {
    //kendisine parametre olarak gelen bir tamsayı dizisini sıralayan ve sonucu geri döndüren metodu yazınız.

    public static int[] sirala(int[] dizi) {
        //1.yontem(Selection sort)
        for (int i = 0; i < dizi.length; i++) {
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] > dizi[j]) {
                    int yedek = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = yedek;
                }
            }
        }
        return dizi;
    }
    //2.yöntem(buble sort)Taner hoca çözümü:

    public static int[] sirala1(int[] dizi1) {
        for (int i = 0; i < dizi1.length; i++) {
            for (int j = 0; j < dizi1.length - 1 - i; j++) {
                if (dizi1[j] > dizi1[j + 1]) {
                    int yedek = dizi1[j];
                    dizi1[j] = dizi1[j + 1];
                    dizi1[j + 1] = yedek;
                }
            }
        }
        return dizi1;
    }

    public static void main(String[] args) {
        int[] dizi = {7, 3, 6, 2, 1, 5, 4, 11, 8};
        int[] dizi1 = {7, 3, 6, 2, 1, 5, 4, 11, 8};
        System.out.println(Arrays.toString(sirala(dizi)));
        System.out.println(Arrays.toString(sirala1(dizi1)));
    }
}
