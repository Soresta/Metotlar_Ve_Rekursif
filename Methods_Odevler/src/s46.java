import java.util.Arrays;

public class s46 {
    //kendisine parametre olarak gelen (boyutu belirsiz) tamsayı dizisinin sütünlerini küçükten büyüğe sıralayan methodu yazınız.
    public static int[][] diziSutunS(int[][] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                for (int k = i + 1; k < dizi.length; k++) {
                    if (dizi[i][j] > dizi[k][j]) {
                        int yedek = dizi[i][j];
                        dizi[i][j] = dizi[k][j];
                        dizi[k][j] = yedek;
                    }
                }
            }
        }
        return dizi;
    }

    public static void main(String[] args) {
        int[][] dizi = {{4, 3, 5, 7},
                        {6, 4, 2, 8},
                        {5, 11, 16, 3},
                        {-7, 15, 23, 18},
                        {-3, 5, 2, 12}};

        int[][] sonuc = diziSutunS(dizi);
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(Arrays.toString(sonuc[i]));
        }
    }
}

