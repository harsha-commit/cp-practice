import java.util.Scanner;

public class YetAnotherTwoIntegers {

    public static int minimumStepsToEquate(int a, int b) {

        // while (a < b) {
        //     steps += 1;
        //     if (b - a > 10) {       
        //         a = a + 10;
        //     } else {
        //         break;
        //     }
        // }

        // while (a > b) {
        //     steps += 1;
        //     if (a - b > 10) { 
        //         a = a - 10;
        //     }
        //     else {
        //         break;
        //     }
        // }

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        
        return (b - a) / 10 + ((b-a)%10 != 0 ? 1 : 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(minimumStepsToEquate(a, b));
            t--;
        }
    }
    
}
