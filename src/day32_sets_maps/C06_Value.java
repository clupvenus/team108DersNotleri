package day32_sets_maps;

import java.util.Map;

public class C06_Value {
    public C06_Value() {
    }

    public static void main(String[] args) {
        Map<Integer, String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();
        ogrenciMap.put(110, "Cemal-Han-12-M-MF");
        System.out.println(ogrenciMap);
        System.out.println(ogrenciMap.keySet());
        System.out.println(ogrenciMap.values());
        boolean sonuc = MapMethodDepo.isimIleOgrenciArama(ogrenciMap, "Ali");
        System.out.println(sonuc);
        System.out.println(MapMethodDepo.isimIleOgrenciArama(ogrenciMap, "Kemal"));
        System.out.println(MapMethodDepo.isimIleOgrenciArama(ogrenciMap, "Cem"));
    }
}
