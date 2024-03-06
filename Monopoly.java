import java.io.*;
import java.util.*;
public class Monopoly
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        for(int i = 0;i < A; i++)
        {
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            if(B <= (C + D) && C <= (B+D) && D <= (B + C))
            {
                System.out.print("NO
");
            }
            else
            {
                System.out.print("YES
");
            }
        }
    }
}