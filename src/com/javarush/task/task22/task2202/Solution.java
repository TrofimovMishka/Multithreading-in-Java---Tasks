package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        String result = null;
        try{
            String [] arr = string.split(" ");
            result = string.substring(string.indexOf(" ")+1, string.indexOf(arr[4])+arr[4].length());
        }catch (Exception ex){
            throw new TooShortStringException();
        }
        return result;
    }

    public static class TooShortStringException extends RuntimeException{
    }
}
