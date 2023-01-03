import java.util.Arrays;

public class s13 {
    //kendisine parametre olarak gelen diziyi ters çeviren rekürsif fonk.
    //1.yöntem
    public static int[] tersD(int[] dizi, int bas, int son) {
        if (bas >= son) return dizi;
        else {
            int yedek = dizi[bas];
            dizi[bas] = dizi[son];
            dizi[son] = yedek;
            return tersD(dizi, bas + 1, son - 1);
        }
    }
    //kendisine parametre olarak gelen diziyi ters çeviren rekürsif fonksiyonu yazınız.

    //2.yöntem:
    public static String tersDizi(int[] dizi, int index) {
        if (index == -1) return "";
        else {
            return dizi[index] + ", " + tersDizi(dizi,index-1);
        }
    }

    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, 4, 5};
        int[] dizi1 = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(tersD(dizi,0,dizi.length-1)));//çıktı : [5, 4, 3, 2, 1]
        System.out.println(tersDizi(dizi1, dizi1.length-1));//çıktı :5, 4, 3, 2, 1,

    }
}
