public class s19 {
    //kendisine parametre olarak gelen tamsayı dizisindeki en küçük elemanın indisini geri döndüren
    //methodu yazınız.

    public static int enKindisi(int[] dizi) {
        int enKucuk = dizi[0], enKindis = 0;
        for (int i = 0; i < dizi.length; i++) {
            if (enKucuk > dizi[i]) {
                enKucuk = dizi[i];
                enKindis = i;
            }
        }
        return enKindis;
    }

    public static void main(String[] args) {
        int[] dizi = {1, 35, 7, 9, 42, 64, 7, -5, -2, 103};
        System.out.println("Dizinin en küçük elamnının indisi = " + enKindisi(dizi));
    }
}
