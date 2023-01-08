public class s7 {
    //kendisine parametre olarak gelen bir tamsayı dizisinde en büyük elemanın
    //indisini hesaplayan rekürsif fonksiyonu yazınız.
    public static int diziEnBE(int[] dizi, int indis, int sayac) {
        if (sayac == dizi.length) return indis;
        else {
            if (dizi[sayac] > dizi[indis]) indis = sayac;
            return diziEnBE(dizi, indis, sayac + 1);
        }
    }

    public static void main(String[] args) {
        int[] dizi = {99, 44, 337747, 223, 643243254, 334, 6527};
        System.out.println(diziEnBE(dizi, 0, 0));
    }
}
