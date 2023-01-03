import java.util.Arrays;

public class s28 {
    //soru26'daki herbir satırın toplamını geri döndüren methodu yazınız.

    public static int[] matrixSaT(int[][] dizi) {
        int[] satirT = new int[dizi.length];
        for (int i = 0; i < dizi.length; i++) {
            int toplam = 0;
            for (int j = 0; j < dizi[i].length; j++) {
                toplam += dizi[i][j];
            }
            satirT[i] = toplam;
        }
        return satirT;
    }

    public static void main(String[] args) {
        int[][] dizi = {{14, 13, 17}, {54, 11, 84}, {64, 28, 54}, {53, 76, 7}};
        System.out.println(Arrays.deepToString(dizi) + " dizisinin herbir satır toplamı = " + Arrays.toString(matrixSaT(dizi)));
    }
}