import java.io.*;
import java.util.Scanner;
public class Swapping
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        A = A + B;
        B = A - B;
        A = A - B;
        System.out.println(A);
        System.out.println(B);
    }
}