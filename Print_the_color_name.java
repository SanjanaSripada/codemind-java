import java.io.*;
import java.util.*;
public class Color
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char C = sc.next().charAt(0);
        if(C == 'V')
        {
            System.out.println("Violet");
        }
        else if(C == 'I')
        {
            System.out.println("Indigo");
        }
        else if(C == 'B')
        {
            System.out.println("Blue");
        }
        else if(C == 'G')
        {
            System.out.println("Green");
        }
        else if(C == 'Y')
        {
            System.out.println("Yellow");
        }
        else if(C == 'O')
        {
            System.out.println("Orange");
        }
        else if(C == 'R')
        {
            System.out.println("Red");
        }
        else
        {
            System.out.println("-1");
        }
    }
}