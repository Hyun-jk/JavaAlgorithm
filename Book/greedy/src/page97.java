import java.util.Scanner;

import static com.sun.deploy.uitoolkit.impl.awt.AWTClientPrintHelper.print;

public class page97 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //N,M을 공백을 기준으로 구분하여 입력 받기
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = 0;

        //한 줄씩 입력 받아 확인하기
        for(int i = 0; i<n; i++){
            int min_value = 10001;

            //현재 줄에서 가장 작은 수 찾기
            for(int j =0; j<m; j++){
                int x = sc.nextInt();
                min_value = Math.min(min_value, x);
            }
            //가장 작은 수들 중에서 가장 큰 수 찾기
            result = Math.max(result, min_value);
        }
        System.out.println(result);

    }
}
