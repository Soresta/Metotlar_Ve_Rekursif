public class s10 {
    //kendisine parametre olarak gelen stringi ters çevirip geri döndüren methodu yazınız.

    public static String tersString(String str) {
        String ters = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            ters += str.charAt(i);

        }
        return ters;
    }

    public static void main(String[] args) {
        System.out.println(tersString("Abdulmütalip :DD mustyyyy"));
    }
}
