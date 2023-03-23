package inner;

class TestCreateInnerClass {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.printOuterClassVar();

        OuterClass.NestedStaticClass staticClass = new OuterClass.NestedStaticClass();
        staticClass.printVar();
    }
}
