public class s24 {
    //kendisine parametre olarak gelen Tamsayı dizisinde en büyük tamsayıyı ve en küçük tamsayıyı
    //geri döndüren  metodu yazınız.

    public static int[] method(int[] dizi) {
        int enbuyuk = dizi[0];
        int enkucuk = dizi[0];
        int[] sonuc = new int[2];
        for (int i = 0; i < dizi.length; i++) {
            if (enbuyuk < dizi[i]) enbuyuk = dizi[i];
            if (enkucuk > dizi[i]) enkucuk = dizi[i];
        }
        sonuc[0] = enbuyuk;
        sonuc[1] = enkucuk;
        return sonuc;
    }

    public static void main(String[] args) {
        int[] dizi = {3, 6, -4, 1, 33, 14, 75, 6, -1, 37};
        int enkucuk = method(dizi)[1];
        int enbuyuk = method(dizi)[0];
        System.out.println("en Küçük değer = " + enkucuk);
        System.out.println("en Büyük değer = " + enbuyuk);
    }
}

