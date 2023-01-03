package day28_Exeptions;

public class C07_ExceptionTurleri {
    public static void main(String[] args) {
        String str="23";
        //str a sayisal olarak 5 ekleyip yazdirin.
        System.out.println(Integer.parseInt(str)+5);

        Object sayiobj=str;
        //string bir object oldugu icin bunu yapabilirim.
        Integer sayiInt= (Integer) sayiobj;

        System.out.println(sayiInt);//ClassCastException





        /*
        eger str icinde sayi olmayan bir karakter olursa
        NumberFormatException
         */
    }
}
