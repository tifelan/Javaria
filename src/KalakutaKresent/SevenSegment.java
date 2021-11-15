package KalakutaKresent;

import java.util.Arrays;

public class SevenSegment {
    private int[][] segment = new int[5][4];

    public void setSevenSegmentScreen(String input) {
        for (int row = 0; row < input.length(); row++) {
            switch (row) {
                case 0 -> {
                    int a = Character.getNumericValue(input.charAt(row));
                    if (a == 1) {
                        setSegmentScreenA();
                    }
                }
                case 1 -> {
                    int b = Character.getNumericValue(input.charAt(row));
                    if (b == 1) {
                        setSegmentScreenB();
                    }
                }
                case 2 -> {
                    int c = Character.getNumericValue(input.charAt(row));
                    if (c == 1) {
                        setSegmentScreenC();
                    }
                }
                case 3 -> {
                    int d = Character.getNumericValue(input.charAt(row));
                    if (d == 1) {
                        setSegmentScreenD();
                    }
                }
                case 4 -> {
                    int e = Character.getNumericValue(input.charAt(row));
                    if (e == 1) {
                        setSegmentScreenE();
                    }
                }
                case 5 -> {
                    int f = Character.getNumericValue(input.charAt(row));
                    if (f == 1) {
                        setSegmentScreenF();
                    }
                }
                case 6 -> {
                    int g = Character.getNumericValue(input.charAt(row));
                    if (g == 1) {
                        setSegmentScreenG();
                    }
                }
                case 7 -> {
                    int h = Character.getNumericValue(input.charAt(row));
                    if (h == 0) {
                        clearScreen();
                    }
                }
            }
        }
//        while(!(Character.getNumericValue(input.charAt()).equals("A")||questions.answer.equals("B"))){
//            System.out.println("""
//                        Invalid input.
//                        Input must be in upper case and must be A or B
//                        """);
//            questions.answer = input.next();
//    }
    }


    public static int[][] createSevenSegment() {
        int[][] segment = {{1, 1, 1, 1}, {1, 0, 0, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 0, 0, 1}};
        return segment;
    }

    int[][] array = new int[5][4];

    private void setSegmentScreenA() {
        segment[0][0] = 1;
        segment[0][1] = 1;
        segment[0][2] = 1;
        segment[0][3] = 1;

    }

    private void setSegmentScreenB() {
        segment[0][3] = 1;
        segment[1][3] = 1;
        segment[2][3] = 1;
    }

    private void setSegmentScreenC() {
        segment[2][3] = 1;
        segment[3][3] = 1;
        segment[4][3] = 1;
    }

    private void setSegmentScreenD() {
        segment[4][0] = 1;
        segment[4][1] = 1;
        segment[4][2] = 1;
        segment[4][3] = 1;
    }

    private void setSegmentScreenE() {
        segment[2][0] = 1;
        segment[3][0] = 1;
        segment[4][0] = 1;
    }

    private void setSegmentScreenF() {
        segment[0][0] = 1;
        segment[1][0] = 1;
        segment[2][0] = 1;
    }

    private void setSegmentScreenG() {
        segment[2][0] = 1;
        segment[2][1] = 1;
        segment[2][2] = 1;
        segment[2][3] = 1;

    }

    public void clearScreen() {
        int[][] zeroArray = segment;
        for (int row = 0; row < zeroArray.length; row++) {
            for (int column = 0; column < zeroArray[0].length; column++) {
                zeroArray[row][column] = 0;
            }
        }
    }

    public void displayScreen() {
        int[][] arrayToDisplay = segment;
        for (int row = 0; row < arrayToDisplay.length; row++) {
            for (int column = 0; column < arrayToDisplay[0].length; column++) {
                if (arrayToDisplay[row][column] == 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
    @Override
    public String toString() {
        return Arrays.deepToString(segment);
    }

//    public int[][] getScreen() {
//        return screen;
//    }
}

