package com.javarush.task.task21.task2101;

/* 
Определяем адрес сети
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {
       byte[] result = new byte[4];
        for (int i = 0; i < result.length; i++) {
            result[i] = (byte) (ip[i] & mask[i]);
        }
        return result;
    }

    public static void print(byte[] bytes) {
        int _0 = bytes[0]+256 >= 256 ? bytes[0] : bytes[0]+256;
        int _1 = bytes[1]+256 >= 256 ? bytes[1] : bytes[1]+256;
        int _2 = bytes[2]+256 >= 256 ? bytes[2] : bytes[2]+256;
        int _3 = bytes[3]+256 >= 256 ? bytes[3] : bytes[3]+256;

        System.out.print(String.format("%8s", Integer.toBinaryString(_0)).replace(" ", "0"));
        System.out.print(" ");
        System.out.print(String.format("%8s", Integer.toBinaryString(_1)).replace(" ", "0"));
        System.out.print(" ");
        System.out.print(String.format("%8s", Integer.toBinaryString(_2)).replace(" ", "0"));
        System.out.print(" ");
        System.out.print(String.format("%8s", Integer.toBinaryString(_3)).replace(" ", "0"));
        System.out.println();
    }
}
