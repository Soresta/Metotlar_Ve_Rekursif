public class s32 {
    //Kendisine parametre olarak gelen tek boyutlu dizideki negatif sayıların toplamını geri döndüren rekürsif fonksiyon

    public static int negatifT(int[] dizi, int i) {
        if (i == dizi.length) return 0;
        else {
            if (dizi[i] < 0) return dizi[i] + negatifT(dizi, i + 1);
            else return negatifT(dizi, i + 1);
        }
    }
    public static void main(String[] args) {
        int[] dizi = {1, 4, -3, 0, -5, -7, 12, 8, 11};
        System.out.println(negatifT(dizi, 0));
    }
}
