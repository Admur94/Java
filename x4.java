public class x4 {
public static void main(String[] args) {
    int[][] tabOne = new int[][] {
            {12, 45, 7, 23, 89},
            {34, 1, 67, 12, 5},
            {90, 22, 33, 78, 14},
            {56, 3, 41, 9, 62}
    };
    int[][] tabTwo = new int[][] {
        {7, 27, 55},
        {29, 7, 10},
        {81, 3, 42},
        {15, 66, 9},
        {37, 21, 5}
    };
    int[][] tabThree = new int[4][3];
    for(int i = 0; i < 4; i++) {
        for (int j = 0; j < 3; j++) {
            for(int k = 0; k < 5; k++) {
                tabThree[i][j] += tabOne[i][k] * tabTwo[k][j];
            }
        }
    }
    System.out.println("Wynik mnożenia macierzy: ");
    for(int[] row : tabThree) {
        for(int a : row) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
}
