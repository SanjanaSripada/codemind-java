import java.io.*;
import java.util.Scanner;
public class Tickets
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int tot;
        tot = input* 4;
        if(tot<=1000)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}