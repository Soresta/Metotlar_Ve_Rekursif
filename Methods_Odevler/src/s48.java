public class s48 {
    //Kendisine parametre olarak gelen 2 boyutlu string dizisindeki birbirine eşit olan ifadeleri bulup ekrana yazan methodu oluştur.
    public static void ayniString(String[][] dizi1) {

        for (int i = 0; i < dizi1.length; i++) {
            for (int j = 0; j < dizi1.length; j++) {
                for (int k = 0; k < dizi1.length; k++) {
                    for (int l = 0; l < dizi1.length; l++) {
                        if (dizi1[i][j].equals(dizi1[k][l]) && (i!=k||j!=l) ) {
                            if (dizi1[i][j].equals("")) continue;
                            System.out.println(dizi1[i][j]);
                            dizi1[i][j]=dizi1[k][l] = "";
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        String[][] strDizi1 = {{"Sorest", "Nayla", "İzmir"},
                {"İstanbul", "İstanbul", "İzmir"},
                {"Nayla", "Adana", "Dayya"}};
        ayniString(strDizi1);
    }
}
