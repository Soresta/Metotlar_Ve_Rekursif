import java.util.Arrays;

public class s47 {
    //kendisine parametre olarak gelen (boyutu belirsiz) tamsayı dizisinin elemanlarını (satır ve sütün olarak)
    //hepsini küçükten büyüğe sıralayan methodu yazınız.

    //örnekte 5x4 boyutu kullanıldı ancak bütün boyutları kabul eder!
    public static int[][] diziSatirS(int[][] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                for (int k = 0; k < dizi.length; k++) {
                    for (int l = 0; l < dizi[i].length; l++) {
                        //Not: eğer büyükten küçüğe sıralanmasını istenirse '|' işaretini  olduğu yerin altındaki '<'
                        // işaretini '>' işaretine çevirmeniz yeterli!..
                        //             |
                        if (dizi[i][j] < dizi[k][l]) {
                            int yedek = dizi[i][j];
                            dizi[i][j] = dizi[k][l];
                            dizi[k][l] = yedek;
                        }
                    }
                }
            }
        }
        return dizi;
    }

    public static void main(String[] args) {
        int[][] dizi = {{13, 10, 5, 3},
                        {9, 16, 1, 6},
                        {12, 7, 2, 14},
                        {15, 8, 4, 11},
                        {18, 17, 20, 19}};

        int[][] sonuc = diziSatirS(dizi);
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(Arrays.toString(sonuc[i]));
        }
    }
}
