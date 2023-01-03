import java.util.Arrays;

public class s34 {
    //kendisine parametre olarak gelen 10 elemanlı tamsayı dizisindeki tek olanların
    //ortalamasını geri döndüren metodu yazınız.

    public static double tekSO(int[] dizi) {
        double tekSort = 0, sayac = 0, toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 == 1) {
                toplam += dizi[i];
                sayac++;
                tekSort = toplam / sayac;
            }
        }
        return tekSort;
    }

    public static void main(String[] args) {
        int[] dizi = {2,3,5,7,11,6,12,15,21,46};
        if (tekSO(dizi) > 0)
            System.out.println(Arrays.toString(dizi) + " dizisindeki tek sayıların ortalaması = " + tekSO(dizi));
        else System.out.println(Arrays.toString(dizi) + " dizisindeki tek sayıların ortalaması Bulunmuyor");
    }
}
