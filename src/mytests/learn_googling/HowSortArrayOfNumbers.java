package mytests.learn_googling;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

class HowSortArrayOfNumbers {
    public static void main(String[] args) {
        HowSortArrayOfNumbers obj = new HowSortArrayOfNumbers();

        int [] arr = obj.getArrayOfPrimitives();

        obj.oneThreadSortArray(arr);
        obj.multithreadingSortArray(arr);
        obj.streamSortingArray(arr);

        obj.reversOrderSortingArray(obj.getArrayOfObject());

    }
    void reversOrderSortingArray(Integer [] arr){
        System.out.println("Revers sorting collections sorting");
        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(arr));

        //One threading sort took: 21 ms
        //Multithreading : 18 ms
        long start = System.currentTimeMillis();
        Arrays.parallelSort(arr, Collections.reverseOrder());
//        Arrays.sort(arr, Collections.reverseOrder());
        long end = System.currentTimeMillis();

        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Stream sorting took: " + (end - start) +" ms");
        System.out.println();
    }

    void streamSortingArray(int [] arr){
        System.out.println("Stream sorting");
        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(arr));

        //Use one thread to sort: One threading sort took: 4 ms
        long start = System.currentTimeMillis();
        arr = Arrays.stream(arr).sorted().toArray();
        long end = System.currentTimeMillis();

        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Stream sorting took: " + (end - start) +" ms");
        System.out.println();
    }

    int[] getArrayOfPrimitives(){
        Random random = new Random();
        int[] arrayToSort = new int[100_00];

        for (int i = 0; i < arrayToSort.length; i++) {
            arrayToSort[i] = random.nextInt(2000);
        }
        return arrayToSort;
    }

    Integer[] getArrayOfObject(){
        Random random = new Random();
        Integer[] arrayToSort = new Integer[100_00];

        for (int i = 0; i < arrayToSort.length; i++) {
            arrayToSort[i] = random.nextInt(2000);
        }
        return arrayToSort;
    }

    void oneThreadSortArray(int[] arr){
        System.out.println("One thread sorting");
        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(arr));

        //Use one thread to sort: One threading sort took: 4 ms
        long start = System.currentTimeMillis();
        Arrays.sort(arr);
        long end = System.currentTimeMillis();

        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("One threading sort took: " + (end - start) +" ms");
        System.out.println();
    }

    void multithreadingSortArray(int[] arrayToSort){
        System.out.println("Multi thread sorting");
        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(arrayToSort));

        //Use multithreading in sorting: Multithreading sort took: 10 ms
        long startTime = System.currentTimeMillis();
        Arrays.parallelSort(arrayToSort);
        long endTime = System.currentTimeMillis();

        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(arrayToSort));

        System.out.println("Multithreading sort took: " + (endTime - startTime) +" ms");
        System.out.println();
    }
}
