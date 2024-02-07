import java.io.*;
import java.util.Scanner;
public class GrossSalary
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double BS = sc.nextDouble();
        double HRA = sc.nextDouble();
        double DA = sc.nextDouble();
        double PF,GS;
        PF = (0.12) *(BS);
        GS = BS + HRA + DA + PF;
        System.out.format("%.2f",PF);
        System.out.format("
%.2f",GS);
    }
}