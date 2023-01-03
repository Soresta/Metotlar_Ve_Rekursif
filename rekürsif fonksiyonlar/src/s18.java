public class s18 {
    //Kendisine parametre olarak gelen String'te küçük harfleri büyük, büyük harfleri küçük yapan
    //rekürsif fonksiyonu yazınız.
    public static String kucukBuyuk(String kelime, int index) {
        if (index == kelime.length()) return "";
        else {
            if (kelime.charAt(index) >= 'a' && kelime.charAt(index) <= 'z')
                return (char) ((kelime.charAt(index) - 32)) + kucukBuyuk(kelime, index + 1);
            else if (kelime.charAt(index) >= 'A' && kelime.charAt(index) <= 'Z')
                return (char) (kelime.charAt(index) + 32) + kucukBuyuk(kelime, index + 1);
            return kelime.charAt(index) + kucukBuyuk(kelime, index + 1);
        }
    }

    public static void main(String[] args) {
        String kelime = "SoresT";
        System.out.println(kucukBuyuk(kelime, 0));
    }

}
