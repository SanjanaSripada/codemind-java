import java.io.*;
import java.util.*;
public class Grades
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        double avg = (A + B + C + D + E)/ 5.0;
        if(avg >= 90)
        {
            System.out.println("Grade A");
        }
        else if(avg >= 80)
        {
            System.out.println("Grade B");
        }
        else if(avg >= 70)
        {
            System.out.println("Grade C");
        }
        else if(avg >= 60)
        {
            System.out.println("Grade D");
        }
        else if(avg >= 40)
        {
            System.out.println("Grade E");
        }
        else
        {
            System.out.println("Grade F");
        }
    }
}