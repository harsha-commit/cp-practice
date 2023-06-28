import java.util.Scanner;

public class DivisibilityProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int m = (a/b) + (a%b != 0 ? 1 : 0);
            System.out.println(m*b - a);
            t--;
        }
    }
}
