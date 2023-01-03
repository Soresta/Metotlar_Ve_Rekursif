import java.util.Arrays;

public class s21 {
    //kendisine parametre olarak gelen dizinin elemanlarını bir arttırıp geri döndüren metodu yazınız.
    public static int[] myMethod(int[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]++;
        }
        return dizi;
    }

    public static void main(String[] args) {
        int[] dizi = {7, 5, 11, 64, 37, 18};
        System.out.println(Arrays.toString(myMethod(dizi)));
    }
}