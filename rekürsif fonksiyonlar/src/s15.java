public class s15 {
    //Kendisine parametre olarak gelen Stringin palindrom olup olmadığını
    //kontrol eden rekürsşf fonksiyonu yazınız.
    public static String palindrom(String str, int bas, int son) {
        if (bas > son) return "String palindrom";
        else if (str.charAt(bas) == str.charAt(son)) return palindrom(str, bas + 1, son - 1);
        else return "Palindrom değildir";
    }

    public static void main(String[] args) {
        String str = "KEK KEK";
        System.out.println(palindrom(str, 0, str.length() - 1));
    }
}
