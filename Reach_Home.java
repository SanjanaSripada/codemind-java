import java.io.*;
import java.util.*;
public class Reach
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int calculation = 5 * X;
        if(Y <= calculation)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}