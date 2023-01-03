import java.util.Arrays;

public class s31 {
    //kendisine parametre olarak gelen 10 elemanlı tamsayı dizisini 1 sağa döndüren ve diziyi
    //ana metoda geri döndüren methodu yazınız.

    public static int[] diziSagK(int[] dizi) {
        for (int i = dizi.length - 1; i > 0; i--) {
            int yedek = dizi[i - 1];
            dizi[i - 1] = dizi[i];
            dizi[i] = yedek;
        }
        return dizi;
    }

    public static void main(String[] args) {
        int[] dizi = {1, 4, 7, 11, 54, 15, 75};
        System.out.println(Arrays.toString(dizi) + " dizisinin bir sag kaydırılmış hali : " + Arrays.toString(diziSagK(dizi)));
    }
}
