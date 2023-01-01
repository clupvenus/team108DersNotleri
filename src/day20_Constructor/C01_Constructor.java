package day20_Constructor;

import day19_ArrayList_ForEachLoop.Toyota;

public class C01_Constructor {
    public static void main(String[] args) {
        Car car1=new Car();
        Toyota toyata=new Toyota();
        System.out.println(car1);
        //Car{marka='Marka belirtilmemis', model='Model belirtilmemis', yil=1900, km=0, renk='Renk secilmemis'}

        System.out.println(toyata);
        //day19_ArrayList_ForEachLoop.Toyota@2d554825
        //Toyota bir obje olodugu icin direk yazdiramayiz referans bilgisini yazdirir.
        //bir class dan olusturulan objelerin belirli ozelliklerini kolayca yazdirabilmek icin
        //o class da istenen ozellikleri kapsayan bir toString(); methodu olusturulabilir.
        /*
        toString methodundaki yazilanlari istedigimiz sekil ve formata uyarlayabiliriz.
         */
        car1.marka="Audi";
        car1.model="A4";
        car1.yil=2020;
        car1.km=20000;
        car1.renk="Siyah";
        System.out.println(car1);
        //Car{marka='Audi',
        // model='A4',
        // yil=2020,
        //km=20000,
        // renk='Siyah'}


    }
}
