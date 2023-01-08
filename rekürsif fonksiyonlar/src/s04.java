public class s4 {
    //Kendisine parametre olarak gelen a ve b sayısının a^b'sini hesaplayan rekürsif fonksiyonu yazınız.
    public static int aUssuB(int a, int b){
        if (b == 1) return a;
        else return a * aUssuB(a,b-1);
    }

    public static void main(String[] args) {
        System.out.println(aUssuB(7,2));
    }
}
