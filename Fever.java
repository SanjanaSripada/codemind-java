import java.io.*;
import java.util.*;
public class Fever
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if(X <= 98)
        {
            System.out.println("NO");
        }
        else
        {
            System.out.println("YES");
        }
    }
}