package day11_forloops;

public class C11_NestedforLoop {
    public static void main(String[] args) {
        /*
        *
        * *
        * * *
        * * * *
        * * *
        * *
        *
         */
        //input degerine kadar her satirda yildiz sayisini bir artirip sonra asagidaki sekli
        //ipucu: artis ve azalislari kisimlari 2 ayri nested loop ile yapmalisiniz.

        int input=4;

        //artis kismi icin nested loop
        for (int i = 1; i <=input; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println("");

        }
        for (int i = input-1; i >=1; i--) {
            for (int j =i; j>=1 ; j--) {
                System.out.print("* ");

            }
            System.out.println("");

        }

    }
}
