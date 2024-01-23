import java.io.*;
import java.util.Scanner;
public class WaterTaps{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int res;
        res = (x * y)/(x + y);
        System.out.println(res);
    }
}