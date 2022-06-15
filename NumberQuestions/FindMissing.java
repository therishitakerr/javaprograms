package NumberQuestions;
import java.util.*;
public class FindMissing
{
    static int search(int a[], int n)
    {
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] == n)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] ag)
    {
        //finds missing numbers(1-10)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        int b[] = new int[10];
        for (int i = 0; i < 10; i++)
        {
            int index = search(a, i+1);
            if (index != -1)
            {
                b[i] = a[index];
            }
        }
        System.out.println("missing numbres");
        for (int j = 0; j < 10; j++)
        {
            if (b[j] == 0)
            {
                System.out.print(j+1+" ");
            }
        }
    }
}
