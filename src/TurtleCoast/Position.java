package TurtleCoast;

public class Position {
    private int rowPosition;
    private int columnPosition;

    public Position(int rowPosition, int columnPosition) {
        this.rowPosition = rowPosition;
        this.columnPosition = columnPosition;
    }

    public int getRowPosition() {
        return rowPosition;
    }

    public void setColumnPosition(int columnPosition) {
        this.columnPosition = columnPosition;
    }

    public void setRowPosition(int rowPosition) {
        this.rowPosition = rowPosition;
    }

    public int getColumnPosition() {
        return columnPosition;
    }
//    public void increaseColumnPosition(int steps) {
//        columnPosition += columnPosition;
//    }

    @Override
    public boolean equals(Object anotherPosition) {
        if (anotherPosition == null) return false;
        if (!anotherPosition.getClass().isInstance(this))  return false;
        Position comparedPosition = (Position) anotherPosition;
        return columnPosition==comparedPosition.columnPosition & rowPosition==comparedPosition.rowPosition;
    }

    @Override
    public String toString() {
        return "Position{" +
                "rowPosition=" + rowPosition +
                ", columnPosition=" + columnPosition +
                '}';
    }
}
