package NumberQuestions;
import java.util.*;
public class LargestSmallest
{
    public static void main(String[] fa)
    {
        Scanner sc = new Scanner(System.in);
        int l = Integer.MIN_VALUE;
        int s = Integer.MAX_VALUE;
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++)
        {
            int v = Integer.parseInt(sc.nextLine());
            if (v > l)
            {
                l = v;
            }
            if (v < s)
            {
                s = v;
            }
        }
        System.out.println("smallest: " + s + "\nlargest: " + l);
    }
}
