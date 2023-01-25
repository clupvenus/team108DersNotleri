package day36_genelTekrar;
class M
{
    static {
        System.out.println('A');
    }
    {
        System.out.println('B');
    }public M (){
    System.out.println('C');
}

}class N extends M{
    static {
        System.out.println('D');
    }{
        System.out.println('E');
    }
}
public class C03_OOPKodOkuma {
    public static void main(String[] args) {
        N n=new N();
    }
    //once static method calisir yazar.Staticler class calismaya basladiginda main methoddan once bile calisir.
    //ama once parentteki class calisir
    //-->A sonra-->D

    //sonra constructor calisir.ama constructorin icinde gizli super() vardir.
    //supere gider sonra static olmayan bloklar once parent -->B

    //Sonra constructorlar calisir once parent  -->C

    //Sonra static blok calisir-->E
    //En son constructor calisir-->F

}
