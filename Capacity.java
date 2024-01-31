import java.io.*;
import java.util.Scanner;
public class Disk
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int S = sc.nextInt();
        int B = sc.nextInt();
        int capacity;
        capacity = T * S * B;
        System.out.println(capacity + " KB" );
    }
}