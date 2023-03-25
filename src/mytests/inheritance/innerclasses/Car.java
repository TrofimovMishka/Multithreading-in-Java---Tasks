package mytests.inheritance.innerclasses;

public class Car {
    public Car() {
        System.out.println("Invoke Car constructor");
    }

    public class Door{
        public Door() {
            System.out.println("Invoke Door constructor");
        }
    }
}
