package StringManipulation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class StringOperations
{
    public String getRepeating(String s)
    {
        String r = "";
        String a = getUnique(s);
        for (char m : a.toCharArray())
        {
            int count = 0;
            for (char n : s.toCharArray())
            {
                if (m == n)
                {
                    count++;
                }
            }
            if (count > 1)
            {
                r = r.concat(m + "");
            }
        }
        return r;
    }
    public String getUnique(String aa)
    {
        char a[] = aa.toCharArray();
        int i, j;
        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a.length; j++)
            {
                if (a[i] == a[j] && (i != j))
                {
                    a[j] = '/';
                }
            }
        }
        return new String(a).replaceAll("/", "");
    }
    public String sort(String a)
    {
        char s[] = a.toCharArray();
        Arrays.sort(s);
        return new String(s);
    }
    public List<String> getSubStrings(String s)
    {
        List<String> sub = new ArrayList<String>();
        for (int i = 0; i < s.length(); i++)
        {
            for (int j = i + 1; j <= s.length(); j++)
            {
                sub.add(s.substring(i, j));
            }
        }
        return sub;
    }
    public boolean isPalindrome(String s)
    {
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
