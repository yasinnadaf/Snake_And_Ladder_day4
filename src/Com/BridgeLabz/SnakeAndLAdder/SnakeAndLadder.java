package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {
    static final int START_POSITION = 0;
    static final int NO_PLAY = 0;
    static final int IF_LADDER = 1;
    static final int IF_SNAKE = 2;
    static int currentposition = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and ladder game");
        int dice = (int) (Math.random()*10)%6+1;
        int option = (int)(Math.random()*10)%3;

        if(option == IF_LADDER){
            System.out.println("Ladder!!");
            currentposition+=dice;

        }
        else if(option == IF_SNAKE){
            System.out.println("snake!!");
            currentposition-=dice;


        }else {
            System.out.println("N0 play");
        }

    }
}
