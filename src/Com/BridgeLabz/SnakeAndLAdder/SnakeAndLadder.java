package com.bridgelabz.snakeandladder;

 public class SnakeAndLadder {
    static final int START_POSITION = 0;
    static final int NO_PLAY = 0;
    static final int IF_LADDER = 1;
    static final int IF_SNAKE = 2;
    static int currentposition = 0;
    static int dicecount = 0;

    public static void main(String[] args) {
     
        System.out.println("Welcome to Snake and ladder game");
        while(currentposition<100) {
            int dice = (int) (Math.random() * 10) % 6 + 1;
            int option = (int) (Math.random() * 10) % 3;
            ++dicecount;

            if (option == IF_LADDER) {
                System.out.println("ladder!!");
                currentposition += dice;

            } else if (option == IF_SNAKE) {
                System.out.println("snake!!");
                currentposition -= dice;


            } else {
                System.out.println("N0 play");
                currentposition = currentposition;
            }
            if(currentposition<START_POSITION){
                currentposition = 0;

            }if(currentposition>100){
                currentposition-=dice;
            }

            System.out.println("currentposition: "+currentposition);

        }
        System.out.println("Total number of time die rolled: " + dicecount);



    }
 }
