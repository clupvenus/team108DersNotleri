package day14_doWhileLoop_scope;

public class C05_Scope {

    int sayi=10;
    static int number;

    public static void main(String[] args) {
     String mainStr="Java";
     number=10;
    //
        // sayi=10;
      //  System.out.println(methodStr2);
        for (int i = 0; i <10 ; i++) {

        }
       // System.out.println(i);

       // static int main sayi=233;

    }
    public static void method1(){
       String method2Str="Guzeldir.";
       number=20;
       //sayi=20;
        System.out.println(method2Str);
    }
    public void method2(){
        String method2Str="Candir";
        number=30;
        sayi=30;
        System.out.println(method2Str);

    }
}
