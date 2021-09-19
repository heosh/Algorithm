import java.util.Arrays;
import java.util.Scanner;

public class ATM {
    
    //https://www.acmicpc.net/problem/11399
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int sum = 0;
        int wait = 0;

        int[] timeArr = new int[cnt];
        for(int i=0; i<cnt; i++)
        {
            timeArr[i] = sc.nextInt();
        }
        //timeArr 오름차순 정령
        Arrays.sort(timeArr);

        //시간 계산
        for(int j=0; j<cnt; j++)
        {
            sum += wait + timeArr[j];
            wait += timeArr[j];
        }
        System.out.println(sum);
    }
}
