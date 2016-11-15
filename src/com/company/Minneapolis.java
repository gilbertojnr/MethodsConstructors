package com.company;

/**
 * Created by gilbertakpan on 11/15/16.
 */
public class Minneapolis {

    private String city;
    private int population;
    private boolean isStateCapital;

    public Minneapolis(){
        city = "metropolis";
    }
    public Minneapolis(String c) {
        if (isValidCity(c)){
            city = c;
        }
    }
    public String getCity() {
        return city;
    }
    public void setCity (String c) {
        if(isValidCity(c)) {
            city = c;
        }
    }
    public boolean isValidCity(String city){
        return !city.isEmpty();
    }
    public int getPopulation(){
        return population;
    }
    public void setPopulation(int p){
        if(p > 0){
            population = p;
        }
    }
    public boolean isStateCapital() {
        return isStateCapital;
    }
    public void setStateCapital(boolean stateCapital){
        isStateCapital = stateCapital;
    }
}
