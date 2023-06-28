import java.util.Scanner;

public class PetyaStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0;

        String s1 = sc.next();
        String s2 = sc.next();

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.compareTo(s2) < 0) {
            res = -1;
        }
        else if (s1.compareTo(s2) > 0) {
            res = 1;
        }

        System.out.println(res);
    }
}
