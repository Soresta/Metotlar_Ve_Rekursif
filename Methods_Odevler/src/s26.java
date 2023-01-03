import java.util.Arrays;

public class s26 {
    //kendisine parametre oalrak gelen iki boyutlu tamsayı dizisindeki en büyük sayıyı
    //geri döndüren methodu yazınız.

    public static int enBuyukEleman(int[][] dizi) {
        int enBuyuk = dizi[0][0];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if (dizi[i][j] > enBuyuk) enBuyuk = dizi[i][j];
            }
        }
        return enBuyuk;
    }

    public static void main(String[] args) {
        int[][] dizi = {{14, 13, 17}, {54, 11, 84}, {64, 28, 54}, {53, 76, 7}};
        System.out.println(Arrays.deepToString(dizi) + " dizisinde en büyük eleman = " + enBuyukEleman(dizi));
    }
}
