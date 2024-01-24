import java.io.*;
import java.util.Scanner;
public class Average
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int avg = sc.nextInt();
        int first = sc.nextInt();
        int second = sc.nextInt();
        int result;
        result = (avg * 3) - second - first; 
        System.out.println(result);
    }
}