public class s8 {
    //kendisine parametre olarak gelen dizinin sıralı olup olmadığını hesaplayan rekürsif fonksiyonu yazınız.

    public static boolean sirali(int[] dizi, int index) {
        if (index == dizi.length - 1) return true;
        else if (dizi[0] > dizi[1]) {
            if (dizi[index] > dizi[index + 1]) return sirali(dizi, index + 1);
            else return false;
        } else {
            if (dizi[index] < dizi[index + 1]) return sirali(dizi, index + 1);
            else return false;
        }
    }

    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, 4, 6};
        System.out.println(sirali(dizi, 0));
    }
}

