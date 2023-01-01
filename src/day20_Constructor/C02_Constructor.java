package day20_Constructor;

public class C02_Constructor {

    public C02_Constructor() {
    }

    public static void main(String[] args) {
        /*
        bir obje olusturullurken istedigimiz ozellikleri direk atayabilirsek
        sonradan tekrar bir atama islemi yapmama gerek kalmaz.
        Bu durumda atamayi bizim yapmamiz yerine constructor in atama yapmasini istemeliyiz.

        atama yapmak icin constructor a parametre gondermeliyiz.
         */

        karesiniYazdir(5);//25
        karesiniYazdir(10);//100
        Car car1=new Car("BMW","5.20",2020,15000,"beyaz");
        System.out.println(car1);
        /*
        Car{marka='BMW',
 model='5.20',
 yil=2020,
km=15000,
 renk='beyaz'}
         */
        Car car2=new Car("Tofas","Sahin",2010);
        System.out.println(car2);
        //Car{marka='Tofas',
        // model='Sahin',
        // yil=2010,
        //km=0,
        // renk='Renk secilmemis'}

        Car car3=new Car("Toyota","Corolla",2016,"Gri");


    }


    public static void karesiniYazdir(int sayi){
        System.out.println(sayi*sayi);

    }
}
