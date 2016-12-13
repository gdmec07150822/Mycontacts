package com.edu.gdmec.s07150822.mycontacts_2;

/**
 * Created by admin on 10/24 0024.
 */
public class User {
    public final static String NAME="name";
    public final static String DANWEI="danwei";
    public final static String MOIBLE="moible";
    public static final String QQ="qq";
    public static final String ADDRESS="address";


    private String name;
    private String danwei;
    private String moible;
    private String qq;

    private String address;
    private int id_DB=-1;

    public String getName() {
        return name;
    }

    public String getDanwei() {
        return danwei;
    }

    public String getMoible() {
        return moible;
    }

    public String getQq() {
        return qq;
    }

    public String getAddress() {
        return address;
    }

    public int getId_DB() {
        return id_DB;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDanwei(String danwei) {
        this.danwei = danwei;
    }

    public void setMoible(String moible) {
        this.moible = moible;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId_DB(int id_DB) {
        this.id_DB = id_DB;
    }


}
