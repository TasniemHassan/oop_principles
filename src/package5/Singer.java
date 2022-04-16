package package5;

import inheritance.Person; // needed to be imported bc coming from diff package

public class Singer extends Person {
    // can use all instance variables that are public and protected

    public Singer(){

    }

    public Singer(String fName, String lName, int age, String gender){
        super(fName, lName, age, gender);
    }

    public void sings(){
        System.out.println("Singer sings");
    }
}
