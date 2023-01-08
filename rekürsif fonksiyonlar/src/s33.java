import java.util.Arrays;

public class s33 {
    //kendisine parametre olarak gelen tek boyutlu sayısal diziyi sıralayan recursive fonksiyonu yazınız.
    static int yedek;

    public static int[] diziSirala(int[] dizi, int i, int j) {
        if (i == dizi.length) return dizi;
        else {
            if (j == dizi.length-1) return diziSirala(dizi, i + 1, 0);
            else if (dizi[j] > dizi[j+1]) {
                yedek = dizi[j];
                dizi[j] = dizi[j+1];
                dizi[j+1] = yedek;
                return diziSirala(dizi, i, ++j);
            } else return diziSirala(dizi, i, ++j);
        }
    }

    public static void main(String[] args) {
        int[] dizi = {5, 34, 2, 6, 41, 11, 34, 254, 75, 35, 32};
        System.out.println(Arrays.toString(diziSirala(dizi, 0, 0)));
    }
}
