import java.io.*;
import java.util.Scanner;
public class Plate
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int perimeter, cost;
        perimeter = 2*(N + M);
        cost = perimeter * X;
        System.out.println(cost);
    }
}