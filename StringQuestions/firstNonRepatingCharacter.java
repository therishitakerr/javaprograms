package StringQuestions;
import java.util.*;
import StringManipulation.*;
public class firstNonRepatingCharacter
{
    public static void main(String[] ahg)
    {
        Scanner sc = new Scanner(System.in);
        StringOperations u = new StringOperations();
        System.out.println(u.getUnique(sc.nextLine()).charAt(0));
    }
}
