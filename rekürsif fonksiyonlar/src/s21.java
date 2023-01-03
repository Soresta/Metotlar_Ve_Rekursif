public class s21 {
    //kendisine parametre olarak gelen tamsayı dizisindeeki pozitif tamsayıların
    //toplamını döndüren rekürsif fonksiyonu yazınız.

    public static int pozSayT(int[] dizi, int bas) {
        if (bas == dizi.length) return 0;
        else {
            if (dizi[bas] > 0) return dizi[bas] + pozSayT(dizi, bas + 1);
            return pozSayT(dizi, bas + 1);
        }
    }

    public static void main(String[] args) {
        int[] dizi = {13, 4, 25, -3, -5, -2};
        System.out.println(pozSayT(dizi, 0));
    }
}

