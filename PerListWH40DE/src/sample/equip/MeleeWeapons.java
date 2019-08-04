package sample.equip;

import sample.SqlClient;

import java.util.HashMap;
import java.util.Map;

public class MeleeWeapons {
    private Map<String,String> mWeaponsSpecifications = new HashMap<>();
    private String type = "meleeWeapons";
    String nameAm;
    String classWeapons;
    String range;
    String damage;
    String penetration;
    String special;
    String wght;
    String availability;
    String subClass;

    public MeleeWeapons(String nameArm) {
        this.nameAm = nameArm;
        SqlClient.connect();
        String[] chArmor = SqlClient.getThing(nameArm, type);
        this.classWeapons = chArmor[1];
        this.range = chArmor[2];
        this.damage = chArmor[3];
        this.penetration = chArmor[4];
        this.special = chArmor[5];
        this.wght = chArmor[6];
        this.availability = chArmor[7];
        this.subClass = chArmor[8];
        SqlClient.disconnect();
    }

    public String getNameAm() {
        return nameAm;
    }

    public String getClassWeapons() {
        return classWeapons;
    }

    public String getRange() {
        return range;
    }

    public String getDamage() {
        return damage;
    }

    public String getPenetration() {
        return penetration;
    }

    public String getSpecial() {
        return special;
    }

    public String getWght() {
        return wght;
    }

    public String getAvailability() {
        return availability;
    }

    public String getSubClass() {
        return subClass;
    }
}
