import stanford.karel.Karel;

public class MidpointFindingKarel extends Karel {

    public void run() {

        putBeeperInTwoCorner();
        midPointFinding();
    }

    void midPointFinding() {

        while (frontIsBlocked()){
            turnAround();
            while (beepersPresent()) {
                moveBeeperInToMiddle();
                move();
                if (noBeepersPresent()) {
                    move();
                }
            }
            if (beepersPresent()){
                moveBeeperInToMiddle();
            }
            move();
            moveBeeperInToMiddle();
        }
    }

    void putBeeperInTwoCorner(){
        putBeeper();
        while (frontIsClear()){
            move();
            if (frontIsBlocked()){
                putBeeper();
            }
        }

    }

    void moveBeeperInToMiddle(){

        while (beepersPresent()) {
            pickBeeper();
            move();
            putBeeper();
            while (frontIsClear()) {
                move();
            }
            turnAround();
        }
    }

    void turnAround(){
        turnLeft();
        turnLeft();
    }
}



