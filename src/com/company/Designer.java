package com.company;

/**
 * Created by gilbertakpan on 11/15/16.
 */
public class Designer {
    String name;
    int yearReleased;
    boolean isLowendProduct;

    public Designer() {
        name = "aldo";
    }
    public Designer(String n) {
        if (isValidName(n)) {
            name = n;
        }
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        if(isValidName(n)) {
            name = n;
        }
    }
    public static boolean isValidName(String name)  {
        return name.contains (" ") && !name.isEmpty();
    }
    public int getYearReleased() {
        return yearReleased;
    }
    public void setYearReleased(int yr) {
        if(yr > 2000) {
                yearReleased = yr;
    }}
    public boolean isLowendProduct(){
        return isLowendProduct;
    }
    public void isLowendProduct(boolean LowendProduct) {
        isLowendProduct = LowendProduct;
    }
}
