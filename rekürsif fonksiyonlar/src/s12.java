public class s12 {
    //kendisine parametre olarak gelen string dizisinde küçük karakterlerin sayısını
    //hesaplayan rekürsif fonksyionu yazınız.

    public static int kucuk(String[] dizi, int diziIndex, int kelimeIndex) {
        if (diziIndex == dizi.length) return 0;
        else {
            if (kelimeIndex == dizi[diziIndex].length()) return kucuk(dizi, diziIndex + 1, 0);
            else if (dizi[diziIndex].charAt(kelimeIndex) >= 'a' && dizi[diziIndex].charAt(kelimeIndex) <= 'z')
                return 1 + kucuk(dizi, diziIndex, kelimeIndex + 1);
            else return kucuk(dizi, diziIndex, kelimeIndex + 1);
        }
    }

    public static void main(String[] args) {
        String[] dizi = {"akifFika", "AHMET", "Fukran", "SON"};
        System.out.println(kucuk(dizi, 0, 0));
    }
}
