import java.io.*;
import java.util.Scanner;
public class Sphere
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double volume;
        volume = (4.0/3.0) * 3.14 *( a * a * a);
        System.out.format("%.2f",volume);
    }
}