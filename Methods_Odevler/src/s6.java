public class s6 {
    //kendisine parametre olarak gelen pozitif tamsayının faktöyelini geri döndüren methodu yazınız.

    public static int faktoyel(int sayi) {
        int faktoyelSonuc = 1;
        for (int i = sayi; i > 0; i--) {
            faktoyelSonuc *= i;
        }
        return faktoyelSonuc;
    }

    public static void main(String[] args) {
        System.out.println("Faktöyel değeri = " + faktoyel(6));
    }
}
