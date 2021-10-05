import java.util.Scanner;

public class Timecount {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();

        int count = 0;
        for(int i=0; i<h+1; i++)
        {
            for(int j=0; j<60; j++)
            {
                for(int k=0; k<60; k++)
                {
                    if(("" + i + j + k).indexOf("3") > -1)
                        count++;
                }
            }
        }
        System.out.println(count);
    }
}
