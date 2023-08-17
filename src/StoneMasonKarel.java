/*check one avenue
        /putBeeper
        comeback
        move to another avenue
        //check one avenue
        //comeback

        */
import stanford.karel.Karel;

public class StoneMasonKarel extends Karel {

    public void run() {

        stoneMasonKarel();

    }

    void stoneMasonKarel() {
        while (rightIsBlocked()) {
            if(frontIsClear()) {
                checkOneAvenue();
                comeBack();
                turnLeft();
                moveToAnotherAvenue();
            }else {
                checkOneAvenue();
                comeBack();
            }
        }
        turnLeft();
    }

    void checkOneAvenue(){
        if(noBeepersPresent()){
            putBeeper();
        }
        turnLeft();
        while (frontIsClear()){
            move();
            if (noBeepersPresent()) {
                putBeeper();
                }
        }
        turnAround();
    }

    void comeBack(){

        while (frontIsClear()){
            move();
        }
    }

    void moveToAnotherAvenue(){

            for (int i = 0; i < 4; i++) {
                move();
            }


    }
    void turnAround(){
        turnLeft();
        turnLeft();
    }










}
