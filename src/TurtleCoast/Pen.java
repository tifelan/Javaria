package TurtleCoast;

import static TurtleCoast.PenPosition.UP;

public class Pen {
    private PenPosition penPosition = UP;

    public PenPosition getPosition() {
        return penPosition;
    }

    public void setPosition(PenPosition down) {
        this.penPosition = down;
    }
//    public void setPenPosition(PenPosition){
//        this.penPosition = up
//    }
}
