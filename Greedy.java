import java.util.Scanner;

public class Greedy {
    //https://www.acmicpc.net/problem/11047 백준 알고리즘 문제
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] coinTypes = new int[n];
        for(int i =0; i < n; i++)
        {
            coinTypes[i] = scan.nextInt();
        }

        int cnt = 0;
        for (int i = n-1; i >= 0; i--)
        {
            cnt += k / coinTypes[i];
            k %= coinTypes[i];
        }
        System.out.println(cnt);
        
        scan.close();
    }
}