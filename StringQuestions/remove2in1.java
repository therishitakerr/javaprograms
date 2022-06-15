package StringQuestions;
import StringManipulation.*;
import java.util.Scanner;
public class remove2in1
{
    public static void main(String[] af)
    {
        StringOperations u = new StringOperations();
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(a.replaceAll(u.getUnique(b), ""));
    }
}
