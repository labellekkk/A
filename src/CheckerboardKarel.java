/*
goOneRow
goUpTONextRow
//goOneRow
*/

import stanford.karel.Karel;

public class CheckerboardKarel extends Karel {

    public void run() {
        putBeeper();
        goOneRow();


    }

    void completeCheckerBoard(){
        putBeeper();
        goOneRow();
        goUpToNextRow();


    }

    void goOneRow() {

        while (frontIsClear()) {
            move();
            if(noBeepersPresent()) {
                move();
                putBeeper();
                if (frontIsBlocked()) {
                    turnLeft();
                }


            }
        }
    }


    void goUpToNextRow(){

        turnLeft();
        move();
        turnLeft();

    }

    void turnAround(){
        turnLeft();
        turnLeft();
    }



    void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
}


