import java.util.Scanner;

public class Elephant {

    public static int minimumStepsToHome(int target) {
        int steps = 0;
        while (target > 0) {
            steps += 1;
            // base case
            if (target <= 5) {
                break;
            }
            // Take maximum step, to reach fast
            target = target - 5;
        }
        return steps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println(minimumStepsToHome(x));
    }
}
