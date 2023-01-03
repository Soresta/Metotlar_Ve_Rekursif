import java.util.Arrays;

public class s17 {
    //kendisine parametre oalrak gelen 2 stringte aynı indisteki aynı karakterleri
    //geri döndüren rekürsif fonksiyonu yazınız.

    public static void main(String[] args) {
        System.out.println(ayniKarakter("Ankara", "Adıyaman", 0));
    }

    public static String ayniKarakter(String str1, String str2, int sayac1) {
        if (sayac1 == str1.length() || sayac1 == str2.length()) return "";
        else {
            if (str1.charAt(sayac1) == str2.charAt(sayac1)) {
                return str1.charAt(sayac1) + ayniKarakter(str1, str2, ++sayac1);
            }
            return ayniKarakter(str1, str2, ++sayac1);
        }
    }
}