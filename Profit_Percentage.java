import java.io.*;
import java.util.Scanner;
public class Profit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double CP = sc.nextInt();
        double SP = sc.nextInt();
        double Profit, PP;
        Profit = SP - CP;
        PP = (Profit / CP) * 100;
        System.out.format("%.2f", PP);
    }
}