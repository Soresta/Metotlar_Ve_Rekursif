public class s16 {
    //Kendisine parametre olarak gelen bir tamsayı dizisinde en büyük
    //elemanını hesaplayan rekürsif fonksiyonu hesaplayınız.
    public static int diziEnBE(int[] dizi, int indis, int sayac) {
        if (sayac == dizi.length) return dizi[indis];
        else {
            if (dizi[sayac] > dizi[indis]) return diziEnBE(dizi, indis+1, sayac + 1);
            return diziEnBE(dizi, indis, sayac + 1);
        }
    }

    public static void main(String[] args) {
        int[] dizi = {1,3,5,11,2,4,6};
        System.out.println(diziEnBE(dizi, 0, 0));
    }
}
