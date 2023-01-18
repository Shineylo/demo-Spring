package be.technobel.bart.demoSpring.fakedb;
import be.technobel.bart.demoSpring.models.Plat;

import java.util.ArrayList;
import java.util.List;

public class PlatFakeDB {
    private List<Plat> plats = new ArrayList<>();

    public PlatFakeDB(){
        plats.add(new Plat(1,"curry",12,List.of("lait de coco","poivron","curry")));
        plats.add(new Plat(2,"lasagne",15,List.of("viande","tomate","pate")));
        plats.add(new Plat(3,"kebab",8,List.of("viande","pain","sauce")));
    }
}
