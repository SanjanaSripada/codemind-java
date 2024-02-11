import java.io.*;
import java.util.*;
public class Donation
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int diff = Y - X;
        System.out.println(diff);
    }
}