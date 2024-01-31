import java.io.*;
import java.util.Scanner;
public class DiskCap
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int S = sc.nextInt();
        int B = sc.nextInt();
        int tot;
        tot = T * S * B * 2 * 512;
        System.out.println(tot);
    }
}