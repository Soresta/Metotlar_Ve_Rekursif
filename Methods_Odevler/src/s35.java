import java.util.Arrays;

public class s35 {
    //kendisine parametre olarak gelen 2 boyutlu string dizisi içinde en uzun karaktere sahip
    //olan stringi ve yerini(satır, sütün) geri döndüren methodu yazınız.

    public static String[] enUstring(String[][] dizi) {
        String[] sonucDizi = new String[3];
        String enUstr = dizi[0][0];
        String indisI = "0", indisJ = "0";
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if (enUstr.length() <= dizi[i][j].length()) {
                    enUstr = dizi[i][j];
                    indisI = String.valueOf(i);
                    indisJ = String.valueOf(j);
                }
            }
        }
        sonucDizi[0] = enUstr;
        sonucDizi[1] = indisI;
        sonucDizi[2] = indisJ;
        return sonucDizi;
    }

    public static void main(String[] args) {
        String[][] stringDizi = {{"Sorest", "Nawa"}, {"Tired", "Luna"}, {"Tayma", "CEKOSLOVAKYA"}};

        System.out.println(Arrays.deepToString(stringDizi) + " dizisinin en uzun elemanı = " + enUstring(stringDizi)[0]
                + ", indisi = (" + enUstring(stringDizi)[1] + "," + enUstring(stringDizi)[2] + ")");
    }
}
