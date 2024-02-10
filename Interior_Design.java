import java.io.*;
import java.util.*;
public class Interior
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int X1 = sc.nextInt();
        int Y1 = sc.nextInt();
        int X2 = sc.nextInt();
        int Y2 = sc.nextInt();
        int tot1 = X1 + Y1;
        int tot2 = X2 + Y2;
        if(tot1 < tot2)
        {
            System.out.println(tot1);
        }
        else
        {
            System.out.println(tot2);
        }
    }
}