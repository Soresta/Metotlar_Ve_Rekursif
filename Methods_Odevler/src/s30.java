import java.util.Arrays;

public class s30 {
    //kendisine parametre olarak gelen 3x3'lük A ve B matrislerinin toplamını geri
    //döndüren methodu yazınız.

    public static int[][] matrixToplami(int[][] matrixA, int[][] matrixB) {
        int[][] toplamMatix = new int[matrixA.length][matrixB.length];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                toplamMatix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }return toplamMatix;
    }

    public static void main(String[] args) {
        int[][] matrixA = new int[3][3];
        int[][] matrixB = new int[3][3];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                matrixA[i][j] =(int) (Math.random()*101);
                matrixB[i][j] =(int) (Math.random()*101);
            }
        }
        System.out.println("MatrixA = " + Arrays.deepToString(matrixA));
        System.out.println("MatrixB = " + Arrays.deepToString(matrixB));
        System.out.println("MatrixA ve MatrixB'nin toplamı = " + Arrays.deepToString(matrixToplami(matrixA,matrixB)));
    }
}
