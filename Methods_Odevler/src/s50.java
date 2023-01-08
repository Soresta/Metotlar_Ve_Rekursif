public class s50 {
    //2 boyutlu string dizisi içindeki her bir string içinde rakam olmayanları ekrana yazdıran method.

    public static void rakamsaSil(String[][] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                String kelime = "";
                for (int k = 0; k < dizi[i][j].length(); k++) {
                    if (dizi[i][j].charAt(k) - 48 >= -9 && dizi[i][j].charAt(k) - 48 <= 9) continue;
                    else kelime += dizi[i][j].charAt(k);
                }
                System.out.println(kelime);
            }
        }
    }

    public static void main(String[] args) {
        String[][] str = {{"** Number 00", "S 0 o 1 r 2 e 3 s 4 t" }, {"N -4 a -5 w 11 a", "L 124 u 493 n -134 a" }};
        rakamsaSil(str);
    }
}
