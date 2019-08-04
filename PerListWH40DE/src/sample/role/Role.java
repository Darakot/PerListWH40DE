package sample.role;

import sample.equip.Armor;
import sample.equip.MeleeWeapons;
import sample.equip.RangedWeapons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Role {
//    String hWorld;
//    String bG;
//    String typeClass;
    Map<String, Integer> charRole = new HashMap();
    Map<String, Integer> Skills = new HashMap<>();
    List<String> aptitudes = new ArrayList<>();
    List<MeleeWeapons> mWeapons = new ArrayList<>();
    List<RangedWeapons> rWeapons = new ArrayList<>();
    List<Armor> armors = new ArrayList<>();
    String firstName;
    String secondName;



    public void newRole (String sHomeWorld,String sBG,String sTypeClass){
        HomeWorld hWorld = new HomeWorld(sHomeWorld);
        Background bG = new Background(sBG);
        TypeClass typeClass = new TypeClass(sTypeClass);


        aptitudes.add(hWorld.gethWorldAptitude());
        aptitudes.add(bG.getBackgrAptitudeChsn());
        aptitudes.add(typeClass.getAptitudesChsn());
        aptitudes.add(typeClass.getAptitudes());


    }
}
