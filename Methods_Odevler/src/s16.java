public class s16 {
    //kendisine parametre olarak gelen stringte 'a' karakterinin olup olmadığını geri döndüren methodu yazınız.

    public static boolean aVarmi(String str) {
        boolean cond = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                cond = true;
                break;
            }
        }
        return cond;
    }

    public static void main(String[] args) {
        if (aVarmi("sorest") == true) System.out.println("vardır");
        else System.out.println("Yoktur");
    }
}
