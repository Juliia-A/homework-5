/**
 * Created by User on 22.11.2016.
 */
public class Ex4 {
    public static void main(String[] args) {
        int n = 7, m = 9;
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (int) (Math.random() * (n + m));
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        int[] maxByEachRow = getMaxByEachRow(arr);

        for (int i = 0; i < maxByEachRow.length; i++) {
            System.out.printf("Minimal value in %d row: %d\n", i + 1, maxByEachRow[i]);
        }
    }

    private static int[] getMaxByEachRow(int[][] matrix) {
        int[] res = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            res[i] = matrix[i][0];
            for (int j = 1; j < matrix[i].length; j++) {
                if (res[i] < matrix[i][j]) {
                    res[i] = matrix[i][j];
                }
            }
        }
        return res;
    }
}
