package day10_stringManipulations;

public class C03_replaceAll {
    public static void main(String[] args) {
        String str="Ja1va 56Guz,zel-dir.";
        //bu metindeki sayilardan kurtulun.
        System.out.println(str.replace("1","")
                .replace("5","")
                .replace("6",""));
        str="Ja1va4 56G7uz,Z9el- d0ir8";
        /*
        Eger genellemeyi butun sayilari yada burun space" " leri butun ozel karakterleri
         gibi genisletmek istersek replace methodu yerine replaceAll kullaniriz.
         Java bu genellemeleri yazabilmemiz icin regex(regular expressions) tanimlamistir.
         \\d :tum digitler
         */
        str=str.replaceAll("\\d","");
        System.out.println(str);

        /*
        \\s : space
        \\S:space olmayan hersey
        \\s+ yanyana birden fazla space
        \\d: digits
        \\D:digit olmayan hersey
        \\w:harf veya rakam
        \\W:harf veya rakam olmayan hersey

         */
        // ozel karakterlerden de kurtulun.
          /*
        Space de ozel karakter oldugundan space in yok olmamasi icin once space yerine
        metinde olmayan bir karakter kullanalim.
         */
        str=str.replaceAll(" ","5");


        str=str.replaceAll("\\W","");
        System.out.println(str);
        str=str.replaceAll("5"," ");
        System.out.println(str);


        /*
        Space de ozel karakter oldugundan space in yok olmamasi icin once space yerine
        metinde olmayan bir karakter kullanalim.
         */
//buradaki harf sayisini bulunuz.

        String input3="Ali Can, Merve Star,Mark Tom";
        input3=input3.replaceAll("\\W","");
        System.out.println(input3.length());//22




    }
}
