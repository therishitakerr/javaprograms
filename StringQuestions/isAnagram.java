package StringQuestions;
import StringManipulation.StringOperations;
import java.util.Scanner;
public class isAnagram
{
    public static void main(String[] ag)
    {
        Scanner sc = new Scanner(System.in);
        StringOperations op = new StringOperations();
        if (op.sort(sc.nextLine()).equals(op.sort(sc.nextLine())))
        {
            System.out.println("anagram");
        }
        else
        {
            System.out.println("not anagram");
        }
    }
}
