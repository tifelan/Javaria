package KalakutaKresent;

public class SevenSegmentDisplay {
    int[][] screen = new int [5][4];

    public void display(){
        int[][] displaySticks = {{1, 1, 1, 1}, {1, 0, 0, 1 }, {1, 1, 1, 1}, {1, 0, 0, 1}, {1, 1, 1, 1}};
        for (int[] displayStick : displaySticks) {
            for (int i : displayStick) {
                if (i == 0) System.out.print(" ");
                else System.out.print(" " + i);
            }
            System.out.println();
        }
    }
}
