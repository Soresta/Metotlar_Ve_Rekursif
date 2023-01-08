import java.util.Arrays;
public class s49 {
    //kendisine parametre olarak gelen iki boyutlu string dizisindeki sutunlardaki stringleri
    //birleştirip tek boyutlu string dizisi haline getiren metodu yazınız.
    public static void StringB(String[][] dizi1, String[] sonuc) {
        for (int i = 0; i < dizi1.length; i++) {
            String toplam = "";
            for (int j = 0; j < dizi1[i].length; j++) {
                toplam += dizi1[j][i];
            }
            sonuc[i] = toplam;
        }
        for (int i = 0; i < sonuc.length; i++) {
            System.out.println(sonuc[i]);
        }
    }

    public static void main(String[] args) {
        String[][] dizi1 = {{"Hatto", "Andetto","Haato"},
                            {"Luna", "Sorest","Laravel"},
                            {"Tayma","Nawa","Omensa"}};
        String[] sonuc = new String[dizi1.length];
        StringB(dizi1,sonuc);
    }
}