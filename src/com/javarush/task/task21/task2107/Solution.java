package com.javarush.task.task21.task2107;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* 
Глубокое клонирование карты
*/

public class Solution implements Cloneable{

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Solution clone = null;
        try {
            clone = solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }

    protected Map<String, User> users = new LinkedHashMap<>();

    public static class User implements Cloneable{
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return age == user.age && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(age, name);
        }

        @Override
        protected User clone() throws CloneNotSupportedException {
            int ageClone = this.age;
            String nameClone = new String(name);
            User userClone = new User(ageClone, nameClone);
            return userClone;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Solution solution = (Solution) o;
        return Objects.equals(users, solution.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users);
    }

    @Override
    protected Solution clone() throws CloneNotSupportedException {
        Solution solutionClone = new Solution();
        Set<String> strings = this.users.keySet();
        strings.stream().forEach(key -> {
            User user = this.users.get(key);
            try {
                solutionClone.users.put(new String(key), user.clone());
            } catch (CloneNotSupportedException ignore) {}
        });
        return solutionClone;
    }
}
