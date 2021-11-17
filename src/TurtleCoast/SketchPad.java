package TurtleCoast;

public class SketchPad {
    private int[][] floor;

    public SketchPad(int floorRow, int floorColumn){
        floor=  new int[floorRow][floorColumn];

    }

    public int[][] getFloor() {
        return floor;
    }
    public void displayFloor(){
        for (int [] row : floor){
            for(int column : row){
                if(column ==1){
                    System.out.print("# ");
                }
            if (column == 0){
                System.out.print(" ");
            }
            }
        }
        }

}
