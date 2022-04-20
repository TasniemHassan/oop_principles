package abstraction.abstract_classes;

import java.util.ArrayList;
import java.util.List;

public class TestAbstraction {
    public static void main(String[] args) {

        /*
        Create an object of Samsung called as s1
        info it will have is as below

       brand: Samsung
       color: Black
       storage: 64
       price: 700
         */

        Samsung s1 = new Samsung("Samsung", "Black", 64, 700);
        Nokia n1 = new Nokia("Nokia", "Blue", 4, 100);
        IPhone i1 = new IPhone("Apple", "Silver", 128, 1000);

        List<Phone> phones = new ArrayList<>();
        phones.add(s1);
        phones.add(n1);
        phones.add(i1);

        /*
Print all objects
Find and print the most expensive one with the message -> "The most expensive phone is = IPhone"
Find and print how many phones are convertible -> 2
 */
        int count =0;
       int price = Integer.MIN_VALUE;
       Phone mostExpensive = null;
        for(Phone phone : phones){
            System.out.println(phone);
            if(phone.price > price) mostExpensive = phone;
        if(phone.isConvertible()) count++;
        }
        System.out.println(count + " phones are convertible");
        System.out.println("The most expensive phone is = " + mostExpensive.getClass().getSimpleName());

        System.out.println(IPhone.OS);
        System.out.println(Samsung.OS);
        System.out.println(Nokia.OS);

        for(Phone phone : phones){
            phone.call();
            phone.ring();
            phone.text();
        }
    }
}
