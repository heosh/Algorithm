import java.util.Scanner;

public class LRUD {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String inputData = sc.nextLine();
        String[] plans = sc.nextLine().split(" ");
        sc.close();

        int x = 1, y = 1;
        int nx = 0, ny = 0;

        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        String[] move_steps = {"L","R","U","D"};

        for(int i = 0; i < plans.length; i++)
        {
            for(int j = 0; j < move_steps.length; j++)
            {
                if(plans[i].equals(move_steps[j]))
                {
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }
            if(nx < 1 || ny < 1 || nx > plans.length || ny > plans.length)
                continue;

            x = nx;
            y = ny;
        }
        System.out.println(x + " " + y);
    }
}
