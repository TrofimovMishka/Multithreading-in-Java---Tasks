package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/

public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        String result = null;
        try{
            String [] arr = string.split("\t");
            if(arr.length < 3){
                throw new TooShortStringException();
            }
            result = arr[1];
        }catch (Exception ex){
            throw new TooShortStringException();
        }
        return result;
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("JavaRush - лучший сервис \tобучения Java."));
    }
}
