package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {
    
    static final int START_POSITION = 0;

    public static void main(String[] args) {

        System.out.println("Welcome to Snake and Ladder Game");

        int dice = (int) (Math.random()*10)%6+1;
        System.out.println("Dice rolled value: "+dice);

    }



        
