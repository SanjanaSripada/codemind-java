import java.io.*;
import java.util.Scanner;
public class Handshakes
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        int handshakes;
        handshakes = (students) * (students - 1)/(2);
        System.out.println(handshakes);
    }
}