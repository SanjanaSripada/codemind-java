import java.io.*;
import java.util.*;
public class Monopoly
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if(X < 3)
        {
            System.out.println("LIGHT");
        }
        else if(X >= 3 && X < 7)
        {
            System.out.println("MODERATE");
        }
        else if(X >= 7)
        {
            System.out.println("HEAVY");
        }
    }
}