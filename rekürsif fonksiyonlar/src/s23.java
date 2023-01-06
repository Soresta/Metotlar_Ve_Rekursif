public class s23 {
    public static void main(String[] args) {
        //kendisine parametre olarak gelen sıralı olduğunu indisi
        int[] dizi = {1, 2, 3, 4, 2, 6, 7, 8, 9, 10};
        System.out.println(indisSirala(dizi, 0));
    }
    public static int indisSirala(int[] dizi, int index) {
        if (index == dizi.length - 1 || dizi[index] > dizi[index + 1]) return index;
        else return indisSirala(dizi, index + 1);
    }
}