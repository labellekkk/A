import stanford.karel.Karel;

public class MidpointFindingKarel extends Karel {

    public void run() {

            putBeeperInTwoCorner();


            




    }


    void midPointFinding(){
        putBeeperInTwoCorner();
        turnAround();
                                                                                                /* for (int i = 0; i <8 ; i++) {

                                                                                            while (leftIsBlocked()) {
                                                                                                moveBeeperInToMiddle();
                                                                                                move();
                                                                                                while (frontIsBlocked()) {
                                                                                                    move();
                                                                                                }
                                                                                            }
                                                                                            moveBeeperInToMiddle();
                                                                                            move();*/

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



