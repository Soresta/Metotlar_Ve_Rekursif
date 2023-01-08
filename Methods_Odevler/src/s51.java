public class s51 {
    //kendisine parametre olarak gelen iki boyutlu tamsayı dizisindeki sutunlardaki sayıları
    //birleştirip tek boyutlu tamsayı dizisi haline getiren metodu yazınız.

    public static void StringB(int[][] dizi1, int[] sonuc) {
        for (int i = 0; i < dizi1.length; i++) {
            int toplam = 0;
            for (int j = 0; j < dizi1[0].length; j++) {
                toplam += dizi1[j][i];
            }
            sonuc[i] = toplam;
        }
        for (int i = 0; i < sonuc.length; i++) {
            System.out.println(sonuc[i]);
        }
    }

    public static void main(String[] args) {
        int[][] dizi1 = {{17, 19, 32},
                {64, 45, 25},
                {65, 4, 11}};
        int[] sonuc = new int[dizi1.length];
        StringB(dizi1, sonuc);
    }
}

