package day19_ArrayList_ForEachLoop;

public class ToyotaRunner {
    public static void main(String[] args) {
        Toyota toyota1=new Toyota();
        System.out.println(toyota1.marka+","
                +toyota1.model+" ,"
                +toyota1.km+","
                +toyota1.renk+","
                +toyota1.yil+",");

//Toyota,Model belirtilmemis ,0,null,0,
        toyota1.model="Corolla";
        toyota1.yil=2020;
        toyota1.km=50000;
        System.out.println(toyota1.marka+","
                +toyota1.model+" ,"
                +toyota1.km+","
                +toyota1.renk+","
                +toyota1.yil+",");
//Toyota,Corolla ,50000,null,2020,

    }
}
