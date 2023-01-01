package day07_ternary_switchstatement;

public class C11_SwichCase {
    public static void main(String[] args) {
     //Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin ve
        // girilen harfin karsiligini yazdirin.
        // I : International S : Software T : Testing Q : Qualifications B: Board
        char harf='p';
        switch (harf){
            case'I':
            case'i':
                System.out.println("International");
                break;
            case'S':
            case's':
                System.out.println("Software");
                break;
            case'T':
            case't':
                System.out.println("Testing");
                break;
            case'Q':
            case'q':
                System.out.println("Qualification");
                break;
            case'B':
            case'b':
                System.out.println("Break");
                break;
            default:
                System.out.println("Yanlis harf secimi");
        }
    }
}
