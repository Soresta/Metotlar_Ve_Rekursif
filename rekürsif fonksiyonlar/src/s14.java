public class s14 {
    //kendisine parametre olarak gelen stringi ters çeviren rekürsif fonk.

    public static String tersString(String kelime,int sayac){
        if (sayac== 0) return String.valueOf(kelime.charAt(sayac));
        else {
            return  kelime.charAt(sayac) + tersString(kelime,sayac-1) ;
        }
    }

    public static void main(String[] args) {
        String kelime = "akif acarak";
        System.out.println(tersString(kelime,kelime.length()-1));
    }
}
