public class s39 {
    //kendisine parametre oalrak gelen 2 boyutlu string dizisinde ki kücük karakterleri geri döndüren method yazınız.
    public static String kucuk(String[][] dizi) {
        String sonuc = "";
        for (int i = 0; i < dizi.length; i++) {

            for (int j = 0; j < dizi[i].length; j++) {
                for (int k = 0; k < dizi[i][j].length(); k++) {
                    char harf = dizi[i][j].charAt(k);
                    if (harf >= 'a' && harf <= 'z') sonuc += (char) (dizi[i][j].charAt(k));
                }
            }
        }
        return sonuc;
    }

    public static void main(String[] args) {
        String[][] dizi = {{"Sorest", "NAWA"}, {"Dayya", "Haato"}};
        System.out.println(kucuk(dizi));
    }
}
