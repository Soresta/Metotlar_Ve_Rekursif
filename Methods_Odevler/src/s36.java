import java.util.Arrays;

public class s36 {
    //satır ve sütüns sayısı girilince dizi oluşturan methodu yazınız.

    public static int[][] diziOlustur(int satir, int sutun) {
        int[][] dizi = new int[satir][sutun];

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                dizi[i][j] = (int) (Math.random() * 101);
            }
        }
        return dizi;
    }

    public static void main(String[] args) {
        int[][] dizi1 = diziOlustur(2, 5);
        int[][] dizi2 = diziOlustur(5, 5);

        System.out.println("1.Dizi = " + Arrays.deepToString(dizi1));
        System.out.println("2.Dizi = " + Arrays.deepToString(dizi2));
    }
}
