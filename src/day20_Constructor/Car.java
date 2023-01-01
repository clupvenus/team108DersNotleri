package day20_Constructor;

public class Car {
    /*
    Bir classdan olusturulabilecek ozellikleri variable veya methodlarla belirleyebiliriz.

     */


    String marka = "Marka belirtilmemis";
    String model = "Model belirtilmemis";
    int yil = 1900;
    int km;
    String renk = "Renk secilmemis";

    public Car(String marka, String model, int yil) {
        this.marka=marka;
        this.model=model;
        this.yil=yil;
    }

    public static void hareket() {


        System.out.println("Tum arabalar hareket eder.");

    }
    public Car(){

    }
    public Car(String mrk,String mdl,int yl, int kmetre,String rnk){
        marka=mrk;
        model=mdl;
        yil=yl;
        km=kmetre;
        renk=rnk;

    }

    public Car(String marka, String model, int yil, String renk) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.renk = renk;
    }
    /*
    bir class da gorunur bir constructor yazdigimizda veya olusturdugumuzda java default constructor i siler.
    Bu durumda daha onceden defaut constructori kullanarak obje olusturan class larda CTE olusur.
    Bu tur sorunlara sebep olmamak icin biz herhangi bir constructor olusturdugumuzda bir tane de parametresiz constructor
    olustururuz.

    constructor da parametre olarak kullanicidan gelen degeri class level daki instance variable a atamaliyiz.
    eger parametre ismi ile instance variable ismi farkli ise sorun yok.
    java otomatik olarak atamamizi anlayacaktir.

    eger parametre isimlerinin anlasilir olmasini isiyorsak this. yazariz
     */

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ",\n model='" + model + '\'' +
                ",\n yil=" + yil +
                ", \nkm=" + km +
                ",\n renk='" + renk + '\'' +
                '}';
    }
}