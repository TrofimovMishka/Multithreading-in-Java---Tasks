package com.javarush.task.task22.task2207;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
Обращенные слова
*/
// C:\Users\Mike\Documents\JavaRushTasks\3.JavaMultithreading\src\com\javarush\task\task22\task2207\pairs.txt
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            List<String> strings = new ArrayList<>();
            reader.lines()
                    .flatMap(line -> Stream.of(line.split(" ")))
                    .forEach(word -> {
                        String reverse = new StringBuilder(word).reverse().toString();
                        if (strings.contains(reverse)) {
                            Pair pair = new Pair();
                            pair.setFirst(word);
                            pair.setSecond(reverse);
                            result.add(pair);
                            strings.remove(reverse);
                        } else {
                            strings.add(word);
                        }
                    });
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;
        }

        public void setFirst(String first) {
            this.first = first;
        }

        public void setSecond(String second) {
            this.second = second;
        }
    }

}
