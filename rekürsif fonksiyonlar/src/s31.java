public class s31 {
    //Kendisine parametre olarak gelen 2 boyutlu string dizisindeki birbirine eşit olan ifadeleri bulup ekrana yazan methodu oluştur
    public static void main(String[] args) {
        String[][] strDizi1 = {{"Sorest","Nayla"},{"İstanbul","Dayya"}};
        String[][] strDizi2 = {{"Sorest","Luna"},{"Ankara","Dayya"}};
        System.out.println(ayniKarakter(strDizi1, strDizi2, 0,0));
    }

    public static String ayniKarakter(String[][] dizi1, String[][] dizi2, int i,int j) {
        if (i == dizi1.length) return "";
        else {
            if (j == dizi1.length) return ayniKarakter(dizi1,dizi2,i+1,0);
            else if (dizi1[i][j]==dizi2[i][j])  return dizi1[i][j] + ", " +  ayniKarakter(dizi1, dizi2, i,++j);
            return ayniKarakter(dizi1, dizi2, i,++j);
        }
    }
}
