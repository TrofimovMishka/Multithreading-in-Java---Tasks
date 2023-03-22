package mytests.learn_googling;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

class HowCheckAvailableMethodsInObject {
    public static void main(String[] args) {
        Class clazz = new HowSortArrayOfNumbers().getClass();

//        Method[] methods = clazz.getMethods(); //Show native and methods from parent
        Method[] methods = clazz.getDeclaredMethods(); //Show custom methods

        for (Method m : methods) {
            System.out.println(Modifier.toString(m.getModifiers()) + " " + m.getName());
        }
    }
}
