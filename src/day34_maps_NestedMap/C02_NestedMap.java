package day34_maps_NestedMap;

import java.util.HashMap;
import java.util.Map;

public class C02_NestedMap {
    public static void main(String[] args) {

/*
Asagidaki bodyi map olarak olusturun.



{
"firstname" : "Ahmet",
"lastname" : "Bulut",
"totalprice" : 500,
"depositpaid" : false,
"bookingdates" : {
       "checkin" : "2021-06-01",
       "checkout" : "2021-06-10"
          },
"additionalneeds" : "wi-fi" }
 */
     //iki tane map var once icten baslayalim
        Map<String,String>bookingdatesMap=new HashMap();
        bookingdatesMap.put("checkin" , "2021-06-01");
        bookingdatesMap.put("checkout" ,"2021-06-10");

        Map<String,Object> body=new HashMap<>();
        body.put("firstname", "Ahmet");
        body.put("lastname" ,"Bulut");
        body.put("totalprice" , 500);
        body.put("depositpaid" , false);
        body.put("bookingdates" ,bookingdatesMap);
        body.put("additionalneeds" ,"wi-fi");

        System.out.println(body);

        //isim bilgisini yazdiralim.
        System.out.println(body.get("firstname"));//Ahmet

        //CheckIn yazdir.
        //booking mapindeki value data turu Object sectik.
        //dolayisiyla body keyine ait value yu object olarak bize getirir.
        //ama biz onun map oldugunu bikiyoruz.
        //dolayisiyla casting () -> yapabiliriz
        System.out.println(((Map) body.get("bookingdates")).get("checkin"));
        //2021-06-01

        //checkoutu yazdiralim.
        //bu sefer akillandi hemen yapti.

        System.out.println(((Map) body.get("bookingdates")).get("checkout"));
//2021-06-10

    }






}
