package day07_ternary_switchstatement;

public class C10_SwitchStatement {
    public static void main(String[] args) {
        // kullanicidan gun numarasini alin haftaici veya haftasonu oldugunu yazdirin.

        int gunNo=1;
        switch (gunNo){
            case 1:
                case 2:
                    case 3:
                        case 4:
            case 5:
                System.out.println("Hafta ici");
                break;
            case 6:
            case 7:
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Gecersiz gun numarasi");
        }
    }
}
