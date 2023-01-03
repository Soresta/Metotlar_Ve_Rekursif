import java.util.Arrays;

public class s29 {
    //kendisine parametre olarak gelen iki boyutlu String dizisindeki en uzun Stringi
    //geri döndüren methodu yazınız.

    public static String enUstring(String[][] dizi) {
        String enUstr = dizi[0][0];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if (enUstr.length() <= dizi[i][j].length()) enUstr = dizi[i][j];
            }
        }
        return enUstr;
    }

    public static void main(String[] args) {
        String[][] dizi = {{"Sorest", "MacBanner"}, {"Nawa", "WantPeace"}, {"WasHere", "Döner"}};
        System.out.println(Arrays.deepToString(dizi) + " dizisinin en uzun Stringi = " + enUstring(dizi));
    }
}
