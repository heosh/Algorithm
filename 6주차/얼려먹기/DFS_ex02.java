package 얼려먹기;
// 음료수 얼려먹기 문제

import java.util.Arrays;
import java.util.Scanner;

public class DFS_ex02 {
    public static int N, M;
 
    public static boolean dfs(int[][] graph, int x, int y) {
        if(x <= 1 || x >= N || y <= -1 || y >= M)
            return false;

        if(graph[x][y] == 0)
        {
            graph[x][y] = 1;
            dfs(graph, x -1, y);
            dfs(graph, x, y -1);
            dfs(graph, x +1, y);
            dfs(graph, x, y +1);
            return true;
        }

        return false;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        // N, M 입력
        N = scanner.nextInt();
        M = scanner.nextInt();
        scanner.nextLine();
        System.out.println("+++++++++");
        System.out.println("n: " + N + " m: " + M);
        int [][] graph = new int[N][M];

        // 2차원 리스트의 맵 정보 입력 받기
        for(int i=0; i<N; i++)
        {
            String str = scanner.nextLine();
            for(int j=0; j<M; j++){
                graph[i][j] = str.charAt(j) - '0';
            }
        }
        scanner.close();
        for(int i=0; i<N; i++){
            System.out.println(Arrays.toString(graph[i]));
        }


        int result = 0;
        // 2차원 리스트의 맵 정보 입력 받기
        for(int i=0; i<N; i++)
        {
            for(int j=0; j<M; j++)
            {
                if(dfs(graph, i, j))
                    result += 1;
            }
        }
        System.out.println(result);
    }
}
