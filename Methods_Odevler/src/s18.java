public class s18 {
    //kendisine parametre olarak gelen tamsayı dizisinde  elemanların toplamını döndüren methodu yazınız.

    public static int diziT(int[] dizi) {
        int toplam = 0;
        for (int element : dizi) {
            toplam += element;
        }
        return toplam;
    }

    public static void main(String[] args) {
        int[] dizi = {1, 4, 6, 11, 42};
        System.out.println("Dizinin elemanlarının toplamı = " + diziT(dizi));
    }
}
