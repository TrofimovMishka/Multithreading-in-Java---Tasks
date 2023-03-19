package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    public static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public static void main(String[] args) {
        Horse scott = new Horse("Scott", 3, 0);
        Horse brett = new Horse("Brett", 3, 0);
        Horse mett = new Horse("Mett", 3, 0);

        List<Horse> horses = new ArrayList<>();
        horses.add(mett);
        horses.add(scott);
        horses.add(brett);

        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run(){
        for (int i = 1; i <= 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void move(){
        horses.forEach(Horse::move);
    }

    public void print(){
        horses.forEach(Horse::print);
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner(){
       return horses.stream().sorted(new Comparator<Horse>() {
           @Override
           public int compare(Horse o1, Horse o2) {
               if(o1.getDistance() < o2.getDistance()){
                   return 1;
               }else if(o1.getDistance() > o2.getDistance()){
                   return -1;
               }
               return 0;
           }
       }).findFirst().orElse(null);
    }

    public void printWinner(){
        System.out.println("Winner is "+getWinner().getName()+"!");
    }
}
