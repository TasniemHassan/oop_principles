package encapsulation;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.make = "BMW"; // setting info for make

        //Getting info for make
        System.out.println(car1.make); // BMW

        //if you don't set info, you get default values
        //Setting info for year
        car1.setYear(2020);

        //Getting info of year
        System.out.println(car1.getYear());

        car1.setPrice(5000, "abcd1234");
        System.out.println(car1.getPrice());

        System.out.println(car1.getIsConvertible()); //true;
    }
}
