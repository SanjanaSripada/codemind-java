import java.io.*;
import java.util.Scanner;
public class King
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int y = sc.nextInt();
        int Maxcars;
        Maxcars = ((X * 5) + (y * 7));
        System.out.println(Maxcars);
    }
}