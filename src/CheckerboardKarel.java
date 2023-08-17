/*
goOneRow
goUpTONextRow
//goOneRow
*/

/*
    putTheCheckerInALine
    getReadyForNextLine

    */
import stanford.karel.Karel;

public class CheckerboardKarel extends Karel {

    public void run() {

        completelyPutTheCheckers();

    }

    void completelyPutTheCheckers(){
        putTheCheckersInARow();
        while (leftIsClear()) {
            getReadyForNextRow();
            putTheCheckersInARow();
            if (rightIsClear()){
                getReadyForNextRow();
                putTheCheckersInARow();


            }else{
                turnAround();
            }
        }
        if (frontIsBlocked()){
            turnRight();
        }
    }

    void putTheCheckersInARow() {
        putBeeper();

        while (frontIsClear()) {
            move();
            if (frontIsClear()) {
                move();
                putBeeper();

            }
        }
    }
        void  getReadyForNextRow() {
            if (facingEast()) {
                turnLeft();
                move();
                turnLeft();
            } else {
                turnRight();
                move();
                turnRight();
            }

        }


        void turnRight(){
            turnLeft();
            turnLeft();
            turnLeft();

        }

        void turnAround(){
            turnLeft();
            turnRight();
        }
}
