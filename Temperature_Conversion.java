import java.io.*;
import java.util.Scanner;
public class Temp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        double f;
        f = (c * 9.0/5.0) + 32;
        System.out.format("%.2f",f);
    }
}