import java.io.*;
import java.util.*;
public class Program
{
  public static void main(String[] args)throws IOException
  {
    BufferedReader prva=new BufferedReader(new BufferedReader(new inputStreamReader(System.in)));
    Scanner scan=new Scanner(System.in);
    System.out.println("Vnesite poljubno celo stevilo:");
    String vnesi=prva.readLine();
    Integer stevilo=Integer.decode(prva);
    int a=5;
    int preveri=stevilo%5;




    if (preveri=0)
    {
      System.out.println("To stevilo je veckratnik stevila 5.");
    }
    else
    {
      System.out.println("To stevilo ni veckratnik stevila 5.");
    }
    System.out.println("Konec naloge");
  }
}