package com.company;

/**
 * Created by gilbertakpan on 11/15/16.
 */
public class CellPhones {
    private String iPhones;
    private int year;
    private boolean newModel;

    public CellPhones() {
        iPhones = "iphone6s";
    }
    public CellPhones(String i) {
        if (isValidIphone(i)) {
            iPhones = i;
        }
    }
    public String getiPhones() {
        return iPhones;
    }
    public void setiPhones(String i) {
        if(isValidIphone(i)) {
            iPhones = i;
        }
    }
    public static boolean isValidIphone(String iPhones) {
        return iPhones.contains ("") && !iPhones.isEmpty() && iPhones.length() <=15;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int y) {
        if(y > 2015 && y < 2017){
            year = y;
        }}
    public boolean newModel() {
        return newModel;}

    public void newModel(boolean model) {
        newModel = model;
    }
}
