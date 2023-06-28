import java.util.Scanner;

public class BeautifulMatrix {

    public static int getMinimumStepsForMatrix(int matrix[][]) {
        int row = 0, col = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] == 1) {
                    row = i + 1;
                    col = j + 1;
                    break;
                }
            }
        }
        
        return Math.abs(3 - row) + Math.abs(3 - col);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println(getMinimumStepsForMatrix(matrix));
    }
}
