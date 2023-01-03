import java.util.Arrays;

public class s22 {
    //kendisine parametre olarak gelen string dizindeki en uzun stringin olduğu indisi geri döndüren metodu yazınız!

    public static int enUzunS(String[] dizi) {
        int enUzunString = dizi[0].length();
        int enUSindis = 0;
        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i].length() > enUzunString) {
                enUzunString = dizi[i].length();
                enUSindis = i;
            }
        }
        return enUSindis;
    }

    public static void main(String[] args) {
        String[] dizi = {"Nawa", "Anher", "Sorest", "Aho"};

        System.out.println(Arrays.toString(dizi) + ". Dizisinde en uzun Stringin indisi = " + enUzunS(dizi));
    }
}



