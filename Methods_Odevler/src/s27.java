import java.util.Arrays;

public class s27 {
    //soru26'daki en büyük elemanının indisini geri döndüren methodu yazınız.

    public static int[] enBIndis(int[][] dizi) {
        int enBuyuk = dizi[0][0];
        int[] indis = {0, 0};
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if (dizi[i][j] > enBuyuk) {
                    enBuyuk = dizi[i][j];
                    indis[0] = i;
                    indis[1] = j;
                }
            }
        }
        return indis;
    }

    public static void main(String[] args) {
        int[][] dizi = {{14, 13, 17}, {54, 11, 84}, {64, 28, 54}, {53, 76, 7}};
        System.out.println(Arrays.deepToString(dizi) + " dizisinde en büyük elemanın indisi = ("
                + enBIndis(dizi)[0] + "," + enBIndis(dizi)[1] + ")");
    }
}

