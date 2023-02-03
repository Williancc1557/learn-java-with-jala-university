public class Matriz {
    public static void main(String[] args) {
        // int notes[][] = new int[LINHA][COLUNA]
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