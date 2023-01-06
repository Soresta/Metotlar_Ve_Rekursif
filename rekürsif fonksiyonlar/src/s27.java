public class s27 {
    //kendisine parametre olarak gelen 2 tamsayı matrislerini çarpan ve sonuç diziyi geri döndüren rekğrsif fonksiyonu yazınız.
    //Zorluk seviyesi 0-10 üzerinde = 10.

    public static int[][] matrisCarpma(int[][] matrisA, int[][] matrisB, int[][] matrixSonuc, int i, int j, int t, int toplam) {
        if (i == matrisA.length) return matrixSonuc;
        else {
            if (t == matrisB.length) {
                matrixSonuc[i][j] = toplam;
                return matrisCarpma(matrisA, matrisB, matrixSonuc, i, j + 1, 0, 0);
            } else if (j == matrisA.length) {
                return matrisCarpma(matrisA, matrisB, matrixSonuc, i + 1, 0, 0, 0);
            } else {
                return matrisCarpma(matrisA, matrisB, matrixSonuc, i, j, t + 1, toplam + (matrisA[i][t] * matrisB[t][j]));
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrisA = {{3, 2, 2}, {2, 1, 4}, {5, 1, 6}, {2, 1, 4}};
        int[][] matrisB = {{1, 3, 5, 4}, {3, 3, 2, 4}, {2, 4, 5, 3}};
        int[][] matrixC = new int[matrisA.length][matrisB[0].length];
        int[][] sonucMatris = matrisCarpma(matrisA, matrisB, matrixC, 0, 0, 0, 0);

        for (int i = 0; i < sonucMatris.length; i++) {
            for (int j = 0; j < sonucMatris[i].length; j++) {
                System.out.println(sonucMatris[i][j]);
            }
        }
    }
}
