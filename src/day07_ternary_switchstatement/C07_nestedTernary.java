package day07_ternary_switchstatement;

public class C07_nestedTernary {
    public static void main(String[] args) {
        //Kullanicidan bir tamsayi alin.
        // Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
        // Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin.
        int sayi=23;
        // System.out.println(sayi>0 ? "sayi pozitif" : "sayi pozitif degil");
        System.out.println(sayi>0
                ?
                (sayi%2==0 ? "cift sayi":"tek sayi")
                :
                (sayi<=-100 && sayi>=-999 ? "Uc basamakli":"Uc basamakli degil")
        );
    }
}
