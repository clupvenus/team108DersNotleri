package day23_dateTime_varargs;

import java.time.LocalDate;
import java.time.Period;

public class C04_period {
    public static void main(String[] args) {
        LocalDate dogumTarihi= LocalDate.of(1995,8,12);
        LocalDate bugun= LocalDate.now();
        Period yas=Period.between(dogumTarihi,bugun);
        System.out.println(yas);
        //P27Y4M8D
        //27 yil 4 ay 8 gun
        System.out.println(yas.getYears());
        //27
        LocalDate baslangic=LocalDate.of(1986,07,17);
        LocalDate bitis=LocalDate.now();
        Period yasim=Period.between(baslangic,bitis);
        System.out.println(yasim);
        //P36Y5M3D
    }
}
