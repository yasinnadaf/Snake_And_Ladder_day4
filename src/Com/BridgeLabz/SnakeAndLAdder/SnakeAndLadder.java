package Com.BridgeLabz.SnakeAndLAdder;

public class SnakeAndLadder {
    static final int START_POSITION =0;
    static final int NO_PLAY =0;
    static final int IF_LADDER =1;
    static final int IF_SNAKE =2;
    static int currentposition=0;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and ladder game");
        int dice= (int) (Math.random()*10)%6+1;
        int option= (int)(Math.random()*10)%3;

        if(option==IF_LADDER){
            currentposition+=dice;
            System.out.println("current player position: "+currentposition);
        }
        else if(option==IF_SNAKE){
            currentposition=-dice;
            System.out.println("current player position: "+currentposition);

        }else {
            System.out.println("N0 play");
        }

    }
}
