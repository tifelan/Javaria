package TurtleCoast;

import static TurtleCoast.Direction.*;
import static TurtleCoast.PenPosition.UP;

public class Turtle {
private Pen pen = new Pen();
private Direction currentDirection = Direction.EAST;
private Position currentPosition = new Position(0,0);

    public Pen getPen() {
        return pen;
    }

    public void penDown() {
        pen.setPosition(PenPosition.DOWN);
    }

    public void penUp() {
        pen.setPosition((UP));
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRIght() {
        if(currentDirection == Direction.EAST) changeCurrentDirectionTO(SOUTH);

        else if (currentDirection == SOUTH)changeCurrentDirectionTO(WEST);

        else if (currentDirection == WEST)changeCurrentDirectionTO(NORTH);

        else if (currentDirection == NORTH)changeCurrentDirectionTO(EAST);
        }

    public void turnLeft() {
        if(currentDirection == Direction.EAST) changeCurrentDirectionTO(NORTH);

        else if (currentDirection == NORTH)changeCurrentDirectionTO(WEST);

        else if (currentDirection == WEST)changeCurrentDirectionTO(SOUTH);

        else if (currentDirection == SOUTH)changeCurrentDirectionTO(EAST);
    }

    private void changeCurrentDirectionTO(Direction newDirection){
        currentDirection = newDirection;
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void moveForward(int steps) {
        if(currentDirection == EAST){
            currentPosition.setColumnPosition(currentPosition.getColumnPosition() + steps -1);
        }
        if (currentDirection == SOUTH) {
            currentPosition.setRowPosition(currentPosition.getRowPosition() + steps - 1);
        }
        if(currentDirection == WEST){
                currentPosition.setColumnPosition(currentPosition.getColumnPosition() + steps - 1);
            }
        if (currentDirection == NORTH){
                currentPosition.setRowPosition(currentPosition.getRowPosition()+ steps - 1);
            }
        }

    private void increaseColumnPositionBy( int steps) {
    }

    public void writeOn(SketchPad sketchpad, int numberOfSteps) {
        if(this.pen.getPosition() == PenPosition.DOWN){
            if(this.currentDirection == EAST){
                int[][] floor = sketchpad.getFloor();
                for(int i = 0; i<numberOfSteps; i++){
                    floor[currentPosition.getRowPosition()][currentPosition.getColumnPosition() + i] = 1;
                }
            }

        }
        moveForward(numberOfSteps);
    }

}
