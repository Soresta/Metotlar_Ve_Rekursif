public class s20 {
    //Kendisine parametre olarak gelen stringteki boşlukları silen rekürsif fonksiyonu yazınız.

    public static String bosSil(String kelime, int index, String sonuc){
        if (index == kelime.length()) return sonuc;
        else{
            if (kelime.charAt(index)==' ') return bosSil(kelime,index+1,sonuc);
            return bosSil(kelime,index+1,sonuc+kelime.charAt(index));
        }
    }

    public static void main(String[] args) {
        System.out.println(bosSil("Sorest Nawa Luna Haato Dayya.",0,""));
    }
}
