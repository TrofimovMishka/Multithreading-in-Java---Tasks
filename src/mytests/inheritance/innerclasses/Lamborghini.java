package mytests.inheritance.innerclasses;

class Lamborghini extends Car.Door{
    public Lamborghini(Car car) {
        car.super();
        System.out.println("Invoke Lamborghini constructor");
    }

    public static void main(String[] args) {
        Lamborghini lamborghini = new Lamborghini(new Car());
    }
}
