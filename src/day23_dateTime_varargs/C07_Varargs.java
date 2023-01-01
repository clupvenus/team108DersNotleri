package day23_dateTime_varargs;

public class C07_Varargs {
    public static void main(String[] args) {
        //Kactane string argument yazilirsa yazilsin argumentlerin en uzun olanini yazdiran bir method olusturun.
        //Not: En uzun kelime olarak birdden fazla kelime varsa ilkini yazdirin.
        enUzunuYazdir("Ilyas","Berivan","Murat");//Berivan
        enUzunuYazdir("Azra","NEsibe","Fatih","Humeyra");//humeyra
    }

    private static void enUzunuYazdir(String... kelimeler) {
        String enuzunKelime =kelimeler[0];
        for (String each:kelimeler
             ) {
            if(each.length()>=enuzunKelime.length()){
                enuzunKelime=each;

            }

        }
        System.out.println(enuzunKelime);
    }
}
