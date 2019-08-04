package sample.role;

import sample.SqlClient;

import java.util.HashMap;
import java.util.Map;

public class Background {
    private Map<String,String> background = new HashMap<>();
    private String type = "background";
    String name;
    String skillsChsn;
    String skills;
    String talentsChsn;
    String talents;
    String equipChsn;
    String equip;
    String backgrBonus;
    String backgrAptitudeChsn;
    String backgrAptitude;

    public Background(String name) {
        this.name = name;
        SqlClient.connect();
        String[] bgAtrs = SqlClient.getAttributes(name, type);
        this.skillsChsn = bgAtrs[1];
        this.skills = bgAtrs[2];
        this.talentsChsn = bgAtrs[3];
        this.talents = bgAtrs[4];
        this.equipChsn = bgAtrs[5];
        this.equip = bgAtrs[6];
        this.backgrBonus = bgAtrs[7];
        this.backgrAptitudeChsn = bgAtrs[8];
        this.backgrAptitude = bgAtrs[9];
        SqlClient.disconnect();
    }

    public String getName() {
        return name;
    }

    public String getSkillsChsn() {
        return skillsChsn;
    }

    public String getSkills() {
        return skills;
    }

    public String getTalentsChsn() {
        return talentsChsn;
    }

    public String getTalents() {
        return talents;
    }

    public String getEquipChsn() {
        return equipChsn;
    }

    public String getEquip() {
        return equip;
    }

    public String getBackgrBonus() {
        return backgrBonus;
    }

    public String getBackgrAptitudeChsn() {
        return backgrAptitudeChsn;
    }

    public String getBackgrAptitude() {
        return backgrAptitude;
    }
}
