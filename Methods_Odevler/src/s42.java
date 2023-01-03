public class s42 {
    //kendisine parametre olarak gelen stringteki sayılaırn toplamını hesaplayan methodu yazınız.
    public static int sSayiTop(String sayi) {
        int toplam = 0, temp;
        for (int i = 0; i < sayi.length(); i++) {
            if (sayi.charAt(i) >= '0' && sayi.charAt(i) <= '9') {
                temp = sayi.charAt(i);
                toplam += temp - 48;
            }
        }
        return toplam;
    }

    public static void main(String[] args) {
        System.out.println(sSayiTop("akif837"));
    }
}
