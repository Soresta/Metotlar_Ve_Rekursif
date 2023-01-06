public class s28 {
    //kendisine parametre olarak gelen 2 boyutlu 2 tamsayı dizisinin (matris toplama) toplayan ve sonuç diziyi
    //geri döndüren rekürsif fonksiyonu yazınız.
    //Zorluk seviyesi 0-10 üzerinde = 9.

    public static int[][] matrisToplama(int[][] matrisA, int[][] matrisB, int i, int j) {
        if (i == matrisA.length) return matrisA;
        else {
            if (j == matrisA[i].length) return matrisToplama(matrisA, matrisB, i + 1, 0);
            matrisA[i][j] = matrisA[i][j] + matrisB[i][j];
            return matrisToplama(matrisA, matrisB, i, j + 1);
        }
    }

    public static void main(String[] args) {
        int[][] matrisA = {{3, 7}, {2, 16}, {8, 6}};
        int[][] matrisB = {{14, 9}, {10, 13}, {12, 5}};
        int[][] sonucMatris = matrisToplama(matrisA, matrisB, 0, 0);

        for (int i = 0; i < sonucMatris.length; i++) {
            for (int j = 0; j < sonucMatris[i].length; j++) {
                System.out.println(sonucMatris[i][j]);
            }
        }
    }
}
