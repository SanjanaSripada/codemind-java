import java.io.*;
import java.util.*;
public class Investment
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int interest_rate = sc.nextInt();
        int current_inflation = sc.nextInt();
        int twice = current_inflation + current_inflation;
        if(interest_rate >= twice)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}