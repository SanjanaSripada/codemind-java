import java.io.*;
import java.util.Scanner;
public class Points
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int res;
        res = B / A;
        System.out.println(res);
    }
}