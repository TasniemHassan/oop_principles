package abstraction.abstract_classes;

public interface BlueTooth {
    void connectBlueTooth();

    // Methods that has body - later versions of Java

    // Static method
    static int getYear(){ // all static methods must be public
        return 2022;
    }

    //Default method (non-static method that has body)
  default boolean isConnected(){ // also public by default.. basically everything public in interfaces
        return true;
   }
}
