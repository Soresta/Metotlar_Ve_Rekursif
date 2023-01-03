public class s11 {
    //kendisine parametre olarak gelen string'te küçük karakterlerin sayısını hesaplayan
    //rekürsif fonksiyonu yazınız.

    public static int kucukKarakter(String kelime, int index) {
        if (index == kelime.length()) return 0;
        else {
            if (kelime.charAt(index) >= 'a' && kelime.charAt(index) <= 'z') return 1 + kucukKarakter(kelime, index + 1);
            else return kucukKarakter(kelime, index + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(kucukKarakter("akif KARACA !,", 0));
    }
}
