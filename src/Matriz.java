public class Matriz {
    public static void main(String[] args) {
        // int notes[][] = new int[LINHA][COLUNA]
        // int notes[][] = {{1, 2, 3}, {3, 4, 5}, {6, 7, 8}} // uniform array or jaquet array
        int LINE = 3;
        int COLUMN = 3;

        int[][] M = new int[LINE][COLUMN];

        for (int i = 0; i < LINE; i++) {
            for (int j = 0; j < COLUMN; j++) {
                System.out.println(M[i][j]);
            }
        }
    }
}