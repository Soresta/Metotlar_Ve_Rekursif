public class s10 {
    //Kendisine parametre olarak gelen dizide kaç tane pozitif sayı olduğunu hesaplayan rekürsif fonksiyonu yazınız.

    public static int pozSay(int[] dizi, int bas){
        if (bas == dizi.length)return  0;
        else {
            if (dizi[bas]>0) return 1 + pozSay(dizi,bas+1);
            return pozSay(dizi,bas+1);
        }
    }

    public static void main(String[] args) {
        int[] dizi = {1,2,4,5,6,7,9,10,11,-3,-5,-2};
        System.out.println(pozSay(dizi,0));
    }
}
