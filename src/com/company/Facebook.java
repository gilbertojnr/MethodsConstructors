package com.company;

/**
 * Created by gilbertakpan on 11/15/16.
 */
public class Facebook {

    private String username;
    private int dateOfBirth;
    private boolean isMale;

    public Facebook() {
        username = "gilbert akpan";
    }
    public Facebook (String u) {
        if (isValidUsername(u)) {
            username = u;
        }
    }
    public String getUsername(){
        return username;
    }
    public void setUsername (String u) {
        if(isValidUsername(u)) {
            username = u;
        }
    }
    public static boolean isValidUsername(String username) {
        return username.contains(" ") && !username.isEmpty();
    }
        public int getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(int d) {
        if(d < 18) {
            dateOfBirth = d;
        }

    }
    public boolean isMale() {
        return isMale;
    }
    public void isMale(boolean male) {
        isMale = male;
    }
}
