import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class page118 {

    public static int n, m, x, y , direction;
    //방문한 위치를 저장하기 위한 맵을 생성하여 0으로 초기화
    public static int[][] d = new int[50][50];
    //전체 맵 정보
    public static int[][] arr = new int[50][50];

    //북,동,남,서 방향 정의
    public static int dx[] = {-1, 0, 1, 0};
    public static int dy[] = {0, 1, 0, -1};

    //왼쪽으로 회전
    public static void turn_left() {
        direction -= 1;
        if(direction == -1) direction = 3;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        direction = Integer.parseInt(st.nextToken());
        d[x][y] = 1;

        //전체 맵 정보를 입력 받기
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //시뮬레이션 시작
        int cnt = 1;
        int turn_time = 0;
        while (true) {
            turn_left();
            int nx = x + dx[direction];
            int ny = y + dy[direction];

            if (d[nx][ny] == 0 && arr[nx][ny] == 0) {
                d[nx][ny] = 1;
                x = nx;
                y = ny;
                cnt += 1;
                turn_time = 0;
                continue;
            } else {
                turn_time += 1;
            }
            if (turn_time == 4) {
                nx = x - dx[direction];
                ny = y - dy[direction];
                if (arr[nx][ny] == 0) {
                    x = nx;
                    y = ny;

                } else {
                    break;
                }
                turn_time = 0;

            }

        }
        System.out.println("turn_time = " + turn_time);
    }
}
