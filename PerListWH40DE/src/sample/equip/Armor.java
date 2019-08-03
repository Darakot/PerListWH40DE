package sample.equip;

import java.util.HashMap;
import java.util.Map;

public class Armor {
    private Map<String,String> armSpecifications = new HashMap<>();
    private String type = "armour";
    String nameAm;
    String locCovered;
    String ap;
    String maxAg;
    String protRating;
    String wght;
    String availability;
    String subClass;


    public Armor(String nameArm) {
        this.nameAm = nameArm;
        SqlClient.connect();
        String[] chArmor = SqlClient.getThing(nameArm, type);
        this.locCovered = chArmor[1];
        this.ap = chArmor[2];
        this.maxAg = chArmor[3];
        this.protRating = chArmor[4];
        this.wght = chArmor[5];
        this.availability = chArmor[6];
        this.subClass = chArmor[7];
        SqlClient.disconnect();

    }


    public String getNameArm() {
        return nameAm;
    }

    public String getLocCovered() {
        return locCovered;
    }

    public String getAp() {
        return ap;
    }

    public String getMaxAg() {
        return maxAg;
    }

    public String getProtRating() {
        return protRating;
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
