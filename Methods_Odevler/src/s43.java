import java.util.Arrays;

public class s43 {
    //kendisine parametre oalrak gelen iki boyutlu string dizisinin satırlarını birleştirip geri döndüren metodu yazınız.
    public static String[] myMethod(String[][] dizi) {
        String[] sonucD = new String[dizi.length];

        for (int i = 0; i < dizi.length; i++) {
            String sonuc = "";
            for (int j = 0; j < dizi[i].length; j++) {
                sonuc += dizi[i][j] + " ";
            }
            sonucD[i] = sonuc;
        }
        return sonucD;
    }

    public static void main(String[] args) {
        String[][] sDizi = {{"Sorest", "Nawa"}, {"Halil", "Aykut"}, {"Elazığ", "Niğde"}};

        System.out.println(Arrays.toString(myMethod(sDizi)));
    }
}
