package inner;

class OuterClass {
    int var = 10;
    static int number = 200;

    class InnerClass{
        void printOuterClassVar(){
            System.out.println(var);
        }
    }

    static class NestedStaticClass{
        void printVar(){
            System.out.println(number);
        }
    }
}
