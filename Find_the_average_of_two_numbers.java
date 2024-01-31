import java.io.*;
import java.util.*;
public class Avg
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c;
        c = (a + b) / 2.0;
        System.out.format("%.4f",c);
    }
}