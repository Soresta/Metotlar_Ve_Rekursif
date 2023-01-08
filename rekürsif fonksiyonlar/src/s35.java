public class s35 {
    //kendisine parametre gelen tamsayıyının asalolup olmadığını kontrol eden rekürsif fonksiyonu yazınız.

    public static boolean asalMi(int sayi,int sayac){
        if (sayac == sayi|| sayi == 2) return true;
        else {
            if (sayi%sayac == 0) return false;
            else return asalMi(sayi,sayac+1);
        }
    }

    public static void main(String[] args) {
        System.out.println(asalMi(3,2));

    }
}
