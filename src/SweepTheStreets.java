import stanford.karel.Karel;

public class SweepTheStreets extends Karel {

    public void run() {
        sweepAllStreet();
    }

        void sweepAllStreet() {
            sweepOneStreet();
            comeBack();
            while (leftIsClear()) {
                goUpNextStreet();
                sweepOneStreet();
                comeBack();
            }
        }

        void sweepOneStreet() {
            while (frontIsClear()) {
                if (beepersPresent()) {
                    pickBeeper();
                }
                move();
            }
            if (beepersPresent()) {
                pickBeeper();
            }

        }

        void comeBack() {
            turnAround();
            while (frontIsClear()) {
                move();
            }
            turnAround();
        }

        void goUpNextStreet() {
            turnLeft();
            move();
            turnRight();
        }


        void turnRight(){
            turnLeft();
            turnLeft();
            turnLeft();
        }

        void turnAround() {
                turnLeft();
                turnLeft();
            }


}








