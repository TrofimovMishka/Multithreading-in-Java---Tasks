package mytests;

import java.util.Arrays;

class MyTest {
    public static void main(String[] args) {
////        System.out.println(calculate(14));
////        Me me = new Me();
//        Integer a = 10;
////        System.out.printf("%X%x%x%x%x%x%x",a,a,a,a,a,a,a);
//        System.out.println(true ? false ? true ? "1":"2":"3":"4");
//        Boolean aBoolean = new Boolean(null);
//        System.out.println(aBoolean);
        Child parent = new Child("Main");
    }
//    One test task from interview - каждый след.сумма 4х предыдущих
//Therefore it's a sequence { 0, 1, 2, 3, 6, 12, 23, 44, ... }
    public static int calculate(int index) {
        int [] arr = new int[index+1];
        for(int i = 0; i<=index; i++){
            if(i < 4){
                arr[i] = i;
            }else{
                int res = 0;
                for (int j = i; j >= i-4 ; j--) {
                    res+=arr[j];
                }
                arr[i] = res;
            }
        }
        return arr[index];
    }



}

class Grandpa {
    Grandpa() { System.out.println("I'm a Grandpa");
    }
}
class Daddy extends Grandpa {
    Daddy() { System.out.println("I'm a Daddy");
    }
}
class Me extends Daddy {
    Me() { System.out.println("It's me!");
    }
}