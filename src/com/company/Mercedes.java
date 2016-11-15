package com.company;

/**
 * Created by gilbertakpan on 11/15/16.
 */
public class Mercedes {

    private String model;
    private int year;
    private boolean isSuv;

    public Mercedes() {
        model = "e-Class";
    }
    public Mercedes(String m) {
        if (isValidModel(m))
            model = m;
    }
    public String getModel() {
        return model;
    }
    public void setModel (String m) {
        if(isValidModel(m))  {
            model = m;
        }
    }
    public boolean isValidModel(String model) {
        return model.contains ("-") && !model.isEmpty() && model.length () <=20;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int y) {
        if (y<=2017) {
            year = y;
        }}
        public boolean isSuv() {
        return isSuv;
    }
    public void setSuv(boolean suv) {
        isSuv = suv;
    }

}
