import java.util.Arrays;

public class s32 {
    //10 elemanlı 2 tamsayı dizisinin toplamını geri döndüren methodu yazınız

    public static int diziToplami(int[] diziA, int[] diziB) {
        int toplamSonucu = 0;
        for (int i = 0; i < diziA.length; i++) {
            toplamSonucu += diziA[i] + diziB[i];
        }
        return toplamSonucu;
    }

    public static void main(String[] args) {
        int[] diziA = {6, 4, 2, 8, 11, 65, 37, 35, 28, 96};
        int[] diziB = {25, 10, 93, 39, 57, 2, 16, 73, 44, 27};

        System.out.println("diziA = " + Arrays.toString(diziA));
        System.out.println("diziB = " + Arrays.toString(diziB));
        System.out.println("diziA ve diziB elemanlarının toplamı = " + diziToplami(diziA, diziB));
    }
}
