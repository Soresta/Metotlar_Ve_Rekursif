public class s9 {
    //Kendisine parametre olarak gelen dizinin simetrik olup olmadığını hesaplayan rekürsif fonksiyonu yazınız.

    public static boolean simetrik(int[] dizi, int bas, int son) {
        if (bas >= son) return true;
        else {
            if (dizi[bas] != dizi[son]) return false;
            return simetrik(dizi,bas+1,son-1);
        }
    }

    public static void main(String[] args) {
        int[] dizi = {1,2,2,1};
        System.out.println(simetrik(dizi,0,dizi.length-1));
    }
}
