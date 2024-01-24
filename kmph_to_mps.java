import java.io.*;
import java.util.Scanner;
public class speed
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double kmph = sc.nextInt();
        double mps;
        mps = kmph * (5.0/18.0);
        System.out.format("%.2f", mps);
    }
}