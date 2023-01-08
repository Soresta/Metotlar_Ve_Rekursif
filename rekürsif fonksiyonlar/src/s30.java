import java.util.Arrays;

public class s30 {
    //kendisine parametre olarak gelen 2 boyutlu 2 String dizisinin sütünlerini ayrı ayrı toplayan ve sonuçları
    //tek boyutlu diziye aktaraıp geri döndüren rekürsif fonksiyonu yazınız.
    public static String[][] birlestirD(String[][] dizi1, String[][] dizi2, int i, int j) {
        if (i == dizi1.length) return dizi1;
        else {
            if (j == dizi1[i].length) return birlestirD(dizi1, dizi2, i + 1, 0);
            else {
                dizi1[i][j] = dizi1[i][j] + dizi2[i][j];
                return birlestirD(dizi1, dizi2, i, j + 1);
            }
        }
    }

    public static void main(String[] args) {
        String[][] dizi1 = {{"Sorest", "İstanbul"}, {"Luna", "Nawa"}};
        String[][] dizi2 = {{"İzmir", "Adana"}, {"Mersin", "Ankara"}};
        System.out.println(Arrays.deepToString(birlestirD(dizi1, dizi2, 0, 0)));
    }
}
