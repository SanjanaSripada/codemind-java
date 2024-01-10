import java.io.*;
import java.util.*;
public class Hypotenuse
{
    public static void main(String args[])
    {
        int a,b;
        double hypotenuse;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        hypotenuse = Math.sqrt(Math.pow(a,2)+ Math.pow(b,2));
        System.out.printf("%.2f",hypotenuse);
    }
}