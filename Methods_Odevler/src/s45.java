import java.util.Arrays;

public class s45 {
    //kendisine parametre olarak gelen 4x4 tamsayı dizisinin satırlarını küçükten büyüğe sıralayan methodu yazınız.
    public static int[][] diziSatirS(int[][] dizi){
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                for (int k = j+1; k < dizi[i].length; k++) {
                    if(dizi[i][j]>dizi[i][k]){
                        int yedek = dizi[i][j];
                        dizi[i][j] = dizi[i][k];
                        dizi[i][k] = yedek;
                    }
                }
            }
        }
        return dizi;
    }

    public static void main(String[] args) {
        int[][] dizi = {{4,3,5,7},{6,4,2,8},{5,11,16,3},{-3,5,2,12},{-9,4,32,12}};

        System.out.println(Arrays.deepToString(diziSatirS(dizi)));
    }
}
