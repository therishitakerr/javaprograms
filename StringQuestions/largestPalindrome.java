package StringQuestions;
import java.util.*;
import StringManipulation.*;
public class largestPalindrome
{
    public static void main(String[] af)
    {
        Scanner sc = new Scanner(System.in);
        StringOperations op = new StringOperations();
        List<String> a = op.getSubStrings(sc.nextLine());
        a.sort((s1, s2) -> s2.length() - s1.length());
        for (String i : a)
        {
            if (op.isPalindrome(i))
            {
                System.out.println(i);
                break;
            }
        }
    }
}
