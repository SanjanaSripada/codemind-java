import java.io.*;
import java.util.Scanner;
public class Mul
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c;
        c = a * b;
        System.out.format("%.2f",c);
    }
}