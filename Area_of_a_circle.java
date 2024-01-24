import java.io.*;
import java.util.Scanner;
public class Triangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double area;
        area = 3.14 * radius * radius;
        System.out.format("%.2f", area);
    }
}