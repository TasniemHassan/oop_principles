package inheritance;

public class Tester extends Person{ // extends person will result in Tester being able to reuse
                                    // all instance variables from Person class except private as long as same package

    public Tester(){

    }
   /* public Tester(String fName, String lName, int age, String gender) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.gender = gender;
    }

    */

   public Tester(String fName, String lName, int age, String gender){
       super(fName, lName, age, gender);
   }

    public void code(){
        System.out.println("Tester codes");
    }
}
