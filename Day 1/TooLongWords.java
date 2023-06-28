import java.util.*;


public class TooLongWords {

    public static String getModifiedWord(String word) {
        int n = word.length();
        if(n <= 10)
            return word;
        return word.charAt(0) + String.valueOf(n-2)+ word.charAt(n - 1);
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println(getModifiedWord(words[i]));
        }
        return;
    }
}