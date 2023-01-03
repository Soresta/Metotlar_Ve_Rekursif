public class s25 {
    //vize ve final notlarının bulunduğu iki diziyi parametre olarak alıp öğrencilerin ortalamasını hesaplayıp
    //geri döndüren methodu yazınız.

    public static double ortalamaH(int[] vizeNotlar, int[] finalNotlar, int ogrenciSayisi, double vizeKatS, double finalKatS) {
        //vize ortalamasını hesaplama
        double genelOrtalam = 0;
        for (int i = 0; i < ogrenciSayisi; i++) {
            genelOrtalam += (vizeNotlar[i] * vizeKatS) + (finalNotlar[i] * finalKatS);
        }
        return genelOrtalam / ogrenciSayisi;
    }

    public static void main(String[] args) {
        int[] vizeNotlar = {100, 55, 60, 60, 67, 96, 45};
        int[] finalNotlar = {100, 60, 70, 70, 70, 100, 55};
        System.out.println("Ögrencilerin genel ortalaması = " + ortalamaH(vizeNotlar, finalNotlar, 3, 0.4, 0.6));
    }
}
