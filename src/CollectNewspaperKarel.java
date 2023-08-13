import stanford.karel.Karel;

public class CollectNewspaperKarel extends Karel {

         public void run(){
                collectNewsPaper();

         }
         void collectNewsPaper(){
             goToNewsPaper();
             pickUpNewsPaper();
             turnAround();
             comeBackToOrigin();
             turnRight();
         }
         void goToNewsPaper(){
             goToWall();
             turnRight();
             goToDoor();
             turnLeft();
             exitThroughDoor();
         }


         void goToWall(){
             while (frontIsClear()){
                 move();
             }
         }

         void goToDoor(){
             while (leftIsBlocked()){
                 move();
             }
         }

         void exitThroughDoor(){
             move();
         }

         void pickUpNewsPaper(){
             pickBeeper();
         }

         void comeBackToOrigin(){
             goToWall();
             turnRight();
             goToWall();

         }

        void turnRight(){
            turnLeft();
            turnLeft();
            turnLeft();
        }

         void turnAround(){
             turnLeft();
             turnLeft();
         }
















}


