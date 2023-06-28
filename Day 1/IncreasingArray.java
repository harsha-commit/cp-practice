import java.util.*;


public class IncreasingArray {

    public static long totalStepsForIncreasingArray(long arr[], int n){
        long totalSteps = 0;
        long minimumRequiredValue = arr[0];

        for(int i = 1; i < n; i++){
            if(arr[i] < minimumRequiredValue){
                totalSteps += minimumRequiredValue - arr[i];
            }
            minimumRequiredValue = Math.max(minimumRequiredValue, arr[i]);
        }

        return totalSteps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println(0);
        }

        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(totalStepsForIncreasingArray(arr, n));
    }
}