package day26_inheritence;

public class FDizelCorolla extends ECorolla{


    String motor="1.6 dizel motor";
    String yakit="Dizel";
    String guvenlik="Abs";
    String renk="renk belirtilmemis";




    public static void main(String[] args) {
        Dtoyota c3=new FDizelCorolla();
        System.out.println(c3.motor);//Toyota
        System.out.println(c3.yakit);//Toyota
       // System.out.println(c3.guvenlik);//CTE
      //  System.out.println(c3.renk);//Cte
        System.out.println(c3.model);//Toyota
       // System.out.println(c3.uretimYeri);//CTE
       // System.out.println(c3.teker);//CTE
        //System.out.println(c3.vites);//CTE
        System.out.println(c3.marka);//Toyota
        //Bazen child class dan obje olusturmakla beraber
        //bu child class`in parent class indaki hangi ozellikleri
        //aldigini bilmek isteriz.
    /*
    Bu durumdan data turunu constructori kullanilan class
    in parent classlarindan secebiliriz.
     */
        ECorolla c2=new FDizelCorolla();
        System.out.println(c2.motor);//Toyota
        System.out.println(c2.yakit);//Toyota
       // System.out.println(c2.guvenlik);//DC
        //Burada once corolladan baslar sonra da parente gider childa geri donmedigi icin buamaz
        //CTE verir.
       // System.out.println(c2.renk);//DC
        System.out.println(c2.model);//Corolla
        System.out.println(c2.uretimYeri);//Corolla
        System.out.println(c2.teker);//Corolla
        System.out.println(c2.vites);//Corolla
        System.out.println(c2.marka);//toyota


        FDizelCorolla c1=new FDizelCorolla();
        System.out.println(c1.motor);//DC
        System.out.println(c1.yakit);//DC
        System.out.println(c1.guvenlik);//DC
        System.out.println(c1.renk);//DC
        System.out.println(c1.model);//Corolla
        System.out.println(c1.uretimYeri);//Corolla
        System.out.println(c1.teker);//Corolla
        System.out.println(c1.vites);//Corolla
        System.out.println(c1.marka);//toyota



    }
}
