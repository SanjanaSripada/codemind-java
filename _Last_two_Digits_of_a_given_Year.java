import java.io.*;
import java.util.*;
public class Digits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int remainder;
        remainder = a % 100;
        if(remainder < 10)
        {
            System.out.println("0" + remainder);
        }
        else
        {
            System.out.println(remainder);    
        }
        
    }
}