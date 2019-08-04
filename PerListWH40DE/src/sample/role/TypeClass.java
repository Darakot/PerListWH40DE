package sample.role;

import sample.SqlClient;

import java.util.HashMap;
import java.util.Map;

public class TypeClass {
    private Map<String,String> typeClass = new HashMap<>();
    private String type = "typeClass";
    String name;
    String aptitudesChsn;
    String aptitudes;
    String classTalentChsn;
    String classBonus;

    public TypeClass(String name) {
        this.name = name;
        SqlClient.connect();
        String[] classAtrs = SqlClient.getAttributes(name, type);
        this.aptitudesChsn = classAtrs[1];
        this.aptitudes = classAtrs[2];
        this.classTalentChsn = classAtrs[3];
        this.classBonus = classAtrs[4];
        SqlClient.disconnect();
    }

    public String getName() {
        return name;
    }

    public String getAptitudesChsn() {
        return aptitudesChsn;
    }

    public String getAptitudes() {
        return aptitudes;
    }

    public String getClassTalentChsn() {
        return classTalentChsn;
    }

    public String getClassBonus() {
        return classBonus;
    }
}
