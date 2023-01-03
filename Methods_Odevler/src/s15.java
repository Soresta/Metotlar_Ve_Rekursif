public class s15 {
    //kendisine parametre olarak gelen stringte kelime sayısını geri döndüren methodu yazınız.

    public static int kelimeSayisi(String str) {
        int sayac = 0;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i - 1) != ' ')
                sayac++;
        }

        return sayac;
    }

    public static void main(String[] args) {
        System.out.println(kelimeSayisi("evel, zaman içinde uzun saçlı yalnız bir adam varmış!"));
    }
}

