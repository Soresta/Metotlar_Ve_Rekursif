import java.util.Arrays;

public class s24 {
    //kendisine parametre olarak gelen iki tamsayıdizinin toplamını geri döndüren rekürsif method

    public static int[] toplam(int[] dizi1,int[] dizi2,int sayac){
        if(sayac == dizi1.length) return dizi1;
        else {
            dizi1 [sayac]= dizi1[sayac] + dizi2[sayac];
            return  toplam(dizi1,dizi2,sayac+1);
        }
    }

    public static void main(String[] args) {
        int[] dizi1 = {1,3,5,6};
        int[] dizi2 = {3,2,1,3};
        System.out.println(Arrays.toString(toplam(dizi1,dizi2,0)));
    }

}
