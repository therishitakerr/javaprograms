package NumberQuestions;
import java.util.*;
public class DuplicateNumbers
{
    public static void main(String[] ag)
    {
        Scanner sc = new Scanner(System.in);
        List<Integer> u = new ArrayList<Integer>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++)
        {
            int v = Integer.parseInt(sc.nextLine());
            if (!(u.contains(v)))
            {
                u.add(v);
            }
        }
        for (int j : u)
        {
            System.out.println(j);
        }
    }
}
