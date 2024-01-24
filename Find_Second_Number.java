import java.io.*;
import java.util.Scanner;
public class Second
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int avg = sc.nextInt();
        int first = sc.nextInt();
        int second;
        second = (avg * 2) - first;
        System.out.println(second);
    }
}