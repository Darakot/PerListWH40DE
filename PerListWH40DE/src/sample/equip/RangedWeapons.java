package sample.equip;

import java.util.HashMap;
import java.util.Map;

public class RangedWeapons {
    private Map<String,String> mWeaponsSpecifications = new HashMap<>();
    private String type = "rangedWeapons";
    String nameAm;
    String classWeapons;
    String range;
    String rateOfFire;
    String damage;
    String penetration;
    String clip;
    String reload;
    String special;
    String wght;
    String availability;
    String subClass;

    public RangedWeapons(String nameArm) {
        this.nameAm = nameArm;
        SqlClient.connect();
        String[] chArmor = SqlClient.getThing(nameArm, type);
        this.classWeapons = chArmor[1];
        this.range = chArmor[2];
        this.rateOfFire = chArmor[3];
        this.damage = chArmor[4];
        this.penetration = chArmor[5];
        this.clip = chArmor[6];
        this.reload = chArmor[7];
        this.special = chArmor[8];
        this.wght = chArmor[9];
        this.availability = chArmor[10];
        this.subClass = chArmor[11];
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

    public String getRateOfFire() {
        return rateOfFire;
    }

    public String getDamage() {
        return damage;
    }

    public String getPenetration() {
        return penetration;
    }

    public String getClip() {
        return clip;
    }

    public String getReload() {
        return reload;
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
