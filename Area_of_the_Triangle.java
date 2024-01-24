import java.io.*;
import java.util.Scanner;
public class Triangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double area, perimeter;
        area = (a + b + c)/2.0;
        perimeter = Math.sqrt(area * (area - a) * (area - b) * (area - c));
        System.out.format("%.2f", perimeter);
    }
}