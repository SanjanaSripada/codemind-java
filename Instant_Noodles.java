import java.io.*;
import java.util.Scanner;
public class Cooking
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int time;
        time = X * Y;
        System.out.println(time);
    }
}