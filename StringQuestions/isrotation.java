package StringQuestions;
import java.util.*;
public class isrotation
{
    public static void main(String[] asd)
    {
        Scanner sc = new Scanner(System.in);
        char a[] = sc.nextLine().toCharArray();
        char b[] = sc.nextLine().toCharArray();
        if (a.length == b.length)
        {
            int i, j, l = a.length;
            for (i = 0, j = l - 1; i < l; i++, j--)
            {
                if (a[i] != b[j])
                {
                    System.out.println("not rotation");
                    return;
                }
            }
            System.out.println("rotation");
        }
        else
        {
            System.out.println("not rotation");
        }
    }
}
