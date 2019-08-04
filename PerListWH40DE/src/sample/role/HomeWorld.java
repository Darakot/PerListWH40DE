package sample.role;

import sample.SqlClient;

import java.util.HashMap;
import java.util.Map;

public class HomeWorld {
    private Map<String,String> homeWorld = new HashMap<>();
    private String type = "homeWorld";
    String name;
    String fateTh;
    String hWorldBonus;
    String hWorldAptitude;
    String wounds;

    public HomeWorld(String name) {
        this.name = name;
        SqlClient.connect();
        String[] hWordAtrs = SqlClient.getAttributes(name, type);
        this.fateTh = hWordAtrs[1];
        this.hWorldBonus = hWordAtrs[2];
        this.hWorldAptitude = hWordAtrs[3];
        this.wounds = hWordAtrs[4];
        SqlClient.disconnect();
    }

    public String getName() {
        return name;
    }

    public String getFateTh() {
        return fateTh;
    }

    public String gethWorldBonus() {
        return hWorldBonus;
    }

    public String gethWorldAptitude() {
        return hWorldAptitude;
    }

    public String getWounds() {
        return wounds;
    }
}
