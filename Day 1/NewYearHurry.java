import java.util.Scanner;

public class NewYearHurry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rounds = sc.nextInt();
        int k = sc.nextInt();
        int res = 0;

        int K = ((240 - k) * 2) / 5;

        for (int i = 1; i <= rounds; i++) {
            if (i * (i + 1) <= K) {
                res = i;
                continue;
            }
            break;
        }

        System.out.println(res);
    }
}
