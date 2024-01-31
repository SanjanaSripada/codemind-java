import java.io.*;
import java.util.*;
public class Days
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int years,weeks;
        years = (days / 365);
        weeks = (days % 365) / 7;
        System.out.println(years);
        System.out.println(weeks);
    }
}