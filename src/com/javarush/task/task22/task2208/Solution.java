package com.javarush.task.task22.task2208;

import java.util.*;

/* 
Формируем WHERE
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static String getQuery(Map<String, String> params) {
        Deque<String> deque = new ArrayDeque<>();

        params.keySet().forEach(key -> {
            String value = params.get(key);
            if(value != null) {
                deque.addFirst(String.format("%s = '%s'", key, value));
            }
        });

        StringBuilder result = getStringBuilder(deque);
        return result.toString();
    }

    private static StringBuilder getStringBuilder(Deque<String> deque) {
        StringBuilder result = new StringBuilder();
        while(!deque.isEmpty()){
            String last = deque.removeLast();
            result.append(last);
            if(!deque.isEmpty()){
                result.append(" and ");
            }
        }
        return result;
    }
}
