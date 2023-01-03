public class s11 {
    //kendisine parametre olarak gelen stringteki küçük karakterleri büyük
    //karakterlere çeviren ve sonucu geri döndüren methodu yazınız.

    public static String String_method(String str) {
        String sonuc = "";
        for (int i = 0; i < str.length(); i++) {
            char harf = str.charAt(i);
            if (harf >= 'a' && harf <= 'z') sonuc += (char) (str.charAt(i) - 32);
            else sonuc += str.charAt(i);
        }
        return sonuc;
    }

    public static void main(String[] args) {
        System.out.println(String_method("lorem ipsum dolor? Sorest!=."));
    }
}

