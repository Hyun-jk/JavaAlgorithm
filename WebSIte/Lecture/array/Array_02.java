package array;
import java.util.Scanner;

public class Array_02 {
    public static int solution(int[] arr) {
        int answer = 1; int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]> max) {
                max = arr[i];
                answer ++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("arr = " + solution(arr));

    }
}
