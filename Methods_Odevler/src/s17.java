public class s17 {
    //kendisine paramtere olarak gelen stringin polindrom olup olmadığını geri döndüren methodu yazınız.

    public static boolean polindrom(String str) {
        int sayac = str.length() - 1;
        boolean cond = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(sayac)) {
                cond = false;
                break;
            }
            sayac--;
        }
        return cond;
    }

    public static void main(String[] args) {
        if (polindrom("kabak")) System.out.println("Girilen String polindrom'dur! ");
        else System.out.println("Girilen String polindrom değildir! ");
    }
}
