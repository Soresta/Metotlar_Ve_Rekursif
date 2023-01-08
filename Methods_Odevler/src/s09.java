public class s9 {
    //kendisine parametre olarak gelen stringteki küçük karakterlerin sayısını geri döndüren methodu yazınız.

    public static int kucukKSayisi(String str) {
        int sayac = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') sayac++;
        }
        return sayac;
    }

    public static void main(String[] args) {
        System.out.println("Küçük karakter sayısı: " + kucukKSayisi("While(alive){code}.:)"));
    }
}
