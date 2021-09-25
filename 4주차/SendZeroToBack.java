import java.util.Arrays;

public class SendZeroToBack {
    public static void reorder(int[] arr)
    {
        int j = 0;
        for(int i:arr)
        {
            if(i != 0)
            {
                arr[j] = i;
                j++;
            }
        }
        for(int i = j; i< arr.length; i++)
        {
            arr[i] = 0;
        }
    }
    public static void main(String[] args) {
        int[] arr = {6, 0, 8, 2, 3, 0, 4, 0, 1};
        reorder(arr);
        System.out.println(Arrays.toString(arr));
    }
}