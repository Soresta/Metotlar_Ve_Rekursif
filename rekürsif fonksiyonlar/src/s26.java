import java.util.Arrays;

public class s26 {
    //2 tane binary dizisinin toplamını hesaplayan ve sonuç diziyi geri döndüren rekürsif metodu yazınız.
    //Not: diziler 1 ve 0 dan oluşacak, 1+1 = 2(binary = 10) , 1 + 1 + 1 = 3(binary 11).

    public static int[] toplam(int[] dizi1,int[] dizi2,int sayac,int[] dizi3,int elde){
        if (sayac!= -1) {
            dizi3[sayac+1]=dizi1[sayac] + dizi2[sayac] + elde;
            if (dizi3[sayac+1]>=2){
                dizi3[sayac+1]=dizi3[sayac+1]-2;
                elde=1;
            }else elde = 0;
            return toplam(dizi1,dizi2,sayac-1,dizi3,elde);
        }
        else dizi3[0]=elde;
        return dizi3;
    }

    public static void main(String[] args) {
        int[] dizi1 = {1,0,1,1,0,1,1,0};
        int[] dizi2 = {1,1,0,0,1,0,1,1};
        int[] dizi3 = new int[dizi1.length+1];
        System.out.println(Arrays.toString(toplam(dizi1,dizi2,dizi1.length-1,dizi3,0)));
    }
}
