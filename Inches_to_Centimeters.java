import java.io.*;
import java.util.Scanner;
public class Conversion
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double inches = sc.nextInt();
        double cm;
        cm = inches * 2.54;
        System.out.format("%.2f",cm);
    }
}