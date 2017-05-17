package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mvl on 17.05.2017.
 */
public class Hippodrome {
    private List<Horse> horses;
    public static Hippodrome game;

    public static void main(String[] args) throws InterruptedException {
        List<Horse> horses = new ArrayList<>();
        horses.add(new Horse("A", 3, 0));
        horses.add(new Horse("B", 3, 0));
        horses.add(new Horse("C", 3, 0));

        game = new Hippodrome(horses);
        game.run();
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }
    public void move(){
        for (Horse horse: horses)
            horse.move();
    }
    public void print(){
        for (Horse horse: horses)
            horse.print();

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public List<Horse> getHorses() {
        return horses;
    }
}
