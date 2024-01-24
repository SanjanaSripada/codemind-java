import java.io.*;
import java.util.Scanner;
public class Square
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int area, perimeter;
        area = a * a;
        perimeter = 4 * a;
        System.out.println(area + " " + perimeter);
        
    }
}