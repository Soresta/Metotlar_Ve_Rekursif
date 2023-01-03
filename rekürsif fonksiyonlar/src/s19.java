import java.util.Arrays;

public class s19 {
    //Kendisine parametre olarak gelen tamsayı dizisinindeki her elemanı 1 artırıp geri döndüren rekürsif fonk. yazınız!

    //1.yöntem
    public static String dizi1Art(int[] dizi, int sayac) {
        if (sayac == dizi.length - 1) return String.valueOf(dizi[sayac] + 1);
        else {
            return dizi[sayac] + 1 + "," + dizi1Art(dizi, ++sayac);
        }
    }

    //2.yöntem
    public static int[] dizi1Arttir(int[] dizi, int sayac) {
        if (sayac == dizi.length) return dizi;
        else {
            dizi[sayac] += 1;
            return dizi1Arttir(dizi, sayac + 1);
        }
    }

    public static void main(String[] args) {
        int[] dizi = {1, 3, 5, 7, 9};
        int[] dizi2 = {1, 3, 5, 7, 9};
        System.out.println(dizi1Art(dizi, 0)); //çıktı = 2,4,6,8,10 (string formunda)
        System.out.println(Arrays.toString(dizi1Arttir(dizi2, 0))); //çıktı =[2,4,6,8,10] (dizi formunda)
    }

}
