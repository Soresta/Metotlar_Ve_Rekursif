import java.util.Arrays;
import java.util.Scanner;

public class s20 {
    //kendisine paramtere olarak gelen tamsayı dizisinin sıralı olup olmadığı geri döndüren methodu yazınız.

    public static boolean diziS(int[] dizi) {
        boolean cond = false;
        int sayac1 = 0, sayac2 = 0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length - 1; j++) {
                if (dizi[j] > dizi[j + 1]) sayac1++;
                if (dizi[j] < dizi[j + 1]) sayac2++;
            }
            if (sayac1 == 0 || sayac2 == 0) cond = true;
        }
        return cond;
    }

    public static void main(String[] args) {
        int[] dizi = {9, 5, 3};
        if (diziS(dizi)) System.out.println("Dizi sıralıdır!");
        else System.out.println("Dizi sıralı değildir!");
    }
}
