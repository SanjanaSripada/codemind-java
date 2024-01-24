import java.io.*;
import java.util.Scanner;
public class Conversion
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String octal = sc.next();
        int decimal;
        decimal = Integer.parseInt(octal , 8);
        System.out.println(decimal);
    }
}