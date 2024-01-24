import java.io.*;
import java.util.Scanner;
public class Loss
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int CP = sc.nextInt();
        int SP = sc.nextInt();
        double Loss , LP;
        Loss = CP - SP;
        LP = (Loss/CP) * 100;
        System.out.format("%.2f",LP);
    }
}