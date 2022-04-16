package encapsulation;

public class Car {

    //instance variables
    public String make;
    private double price; //lets assume we require a password
    private int year; // private only accessible in same class
    private boolean isConvertible = true; //lets say we never want to change this

    //Providing indirect access to year to set and get info
    public void setYear(int year){ // always void type
        this.year = year;
    }

    public int getYear(){ //always return type
        return this.year;
    }

    //Writing or setting info
    public void setPrice(double price, String adminPassword){
        if(adminPassword.equals("abcd1234")) this.price = price;
        else throw new RuntimeException("The password entered is not valid!!!");
    }
    //Reading or getting info
    public double getPrice(){
        return price;
    }

    public boolean getIsConvertible(){
        return isConvertible;
    }



}
