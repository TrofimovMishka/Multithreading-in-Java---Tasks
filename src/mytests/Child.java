package mytests;


class Child extends Parent{
    static {
        System.out.println("Child - static");
        new Child("Static parents");
    }

    public Child(String message) {
        System.out.println("Child - constructor " + message);
    }
}
