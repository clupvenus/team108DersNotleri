package day10_stringManipulations;

public class C08_forLoop {
    public static void main(String[] args) {
        // 1 ile 100 arasindaki sayilari yanyana yazdirin.
        //yazdirma islemi bittiginde
        //"Tum bu sayilarin toplami ="deyip sayilarin toplamini yazdirin.
        int sayilarinToplami=0;

        for (int i=25; i<=45;i++)
        {
            System.out.print(i+" ");
            sayilarinToplami=sayilarinToplami+i;
        }
        System.out.println("");
        System.out.println("Tum bu sayilarin Toplami ="+sayilarinToplami);
    }
}
