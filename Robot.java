public class Robot {
    // to-do: change file name, class, and constructor to Robot

    private int[] hallway;
    private int position; // the robot's current position
    private boolean isFacingRight; // true if the robot is facing right

    public Robot(int[] hallwayToClean, int startingPosition) {
        this.hallway = hallwayToClean;
        
        for (int i = 0; i < hallway.length; i++) {
            if (
                hallway[i] < 0
            ) {
                hallway[i] = 0;
            }
        }

        if (
            startingPosition <= 0
        ) {
            this.position = 0;
        } else if (
            startingPosition > 3
        ) {
            this.position = 3;
        } else {
            this.position = startingPosition;
        }
        
        isFacingRight = true;
    }
    

    public int[] getHallway() {
        return hallway;
    }


    public void setHallway(int[] hallway) {
        this.hallway = hallway;
        for (int i = 0; i < hallway.length; i++) {
            if (
                hallway[i] < 0
            ) {
                hallway[i] = 0;
            }
        }
    }


    public int getPosition() {
        return position;
    }


    public void setPosition(int position) {
        if (
            position <= 0
        ) {
            this.position = 0;
        } else if (
            position > 3
        ) {
            this.position = 3;
        } else {
            this.position = position;
        }
    }


    public boolean isFacingRight() {
        return isFacingRight;
    }


    public void setFacingRight(boolean isFacingRight) {
        this.isFacingRight = isFacingRight;
    }


    /*
     * Determines if the robot is blocked by a wall (the end of an array)
     * 
     * @return true if the robot is blocked by a wall, false otherwise
     */
    public boolean isRobotBlockedByWall() {
        if (
            isFacingRight && position == hallway.length - 1
        ) {
            return true;
        } else if (
            !isFacingRight && position == 0
        ) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * Commands the robot to pick up an item, move forward or turn around
     */
    public void move() {
        if (
            hallway[position] > 1
        ) {
            hallway[position] -= 1;
        } else if (
            hallway[position] == 1 && !isRobotBlockedByWall() && isFacingRight
        ) {
            hallway[position] -= 1;
            position++;
        } else if (
            hallway[position] == 1 && !isRobotBlockedByWall() && !isFacingRight
        ) {
            hallway[position] -= 1;
            position--;
        } else if (
            hallway[position] == 0 && !isRobotBlockedByWall() && isFacingRight
        ) {
            position++;
        } else if (
            hallway[position] == 0 && !isRobotBlockedByWall() && !isFacingRight
        ) {
            position--;
        } else if (
            hallway[position] == 0 && isRobotBlockedByWall() && !isFacingRight
        ) {
            isFacingRight = true;
        } else if (
            hallway[position] == 0 && isRobotBlockedByWall() && isFacingRight
        ) {
            isFacingRight = false;
        } else if (
            hallway[position] == 1 && isRobotBlockedByWall() && !isFacingRight
        ) {
            hallway[position] -= 1;
            isFacingRight = true;
        } else if (
            hallway[position] == 1 && isRobotBlockedByWall() && isFacingRight
        ) {
            hallway[position] -= 1;
            isFacingRight = false;
        } 

    }

    /**
     * This method displays the current state of the robot and the hallway. It then
     * calls the move() method and counts the number of moves it takes to clear the
     * hallway. The method should display the current state of the robot after each
     * move.
     * 
     * @return the number of moves made
     */

    public int clearHall() {
        int count = 0;
        while (!hallIsClear()) {
            move();
            count++;
        }
        return count;
    }
    
    /**
     * This method determines if the hallway contains any items.
     * 
     * @return a boolean value indicating if the hallway contains any items
     */

    public boolean hallIsClear() {
        for (int i = 0; i < hallway.length; i++) {
            if (
                hallway[i] != 0
            ) {
                return false;
            }
        }
        return true;
    }

    /*
     * Displays the current state of the robot and the hallway.
     */
    public void displayState() {
        char y = ' ';
        if (
            isFacingRight
        ) {
            y = '>';
        } else {
            y = '<';
        }
        for (int i = 0; i < hallway.length; i++) {
            System.out.println(i);
        }
        int space = position * 2;
        System.out.println("\n");
        for (int i = 0; i < space; i++) {
            System.out.println(" ");
        }
        System.out.println(y);
        
    }
}


