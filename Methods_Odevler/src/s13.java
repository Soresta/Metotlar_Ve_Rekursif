public class s13 {
    //kendisine parametre olarak gelen stringteki "aa" stringlerinden kaç tane olduğunu geri döndüren methodu yazınız.

    public static int kacString(String cumle) {
        int sayac = 0;
        for (int i = 0; i < cumle.length() - 1; i++) {
            if (cumle.charAt(i) == 'a' && cumle.charAt(i + 1) == 'a') {
                i++;
                sayac++;
            }
        }
        return sayac;
    }

    public static void main(String[] args) {
        System.out.println(kacString("nawa aa sorestaa salihaaaa macbanner aaaa"));
    }
}
