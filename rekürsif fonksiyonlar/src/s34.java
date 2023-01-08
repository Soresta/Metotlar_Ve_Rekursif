public class s34 {
    //Özyinelemeli şekilde girilen sayının basamakları toplamını bulan metod yazın. ör:12 =1+2=3

    public static int basamakT (int sayi){
        if (sayi == 0) return 0;
        else return sayi%10 + basamakT(sayi/10);
    }

    public static void main(String[] args) {
        System.out.println(basamakT(393));
    }
}

