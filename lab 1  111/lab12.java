import java.util.Scanner;
public class lab12
{
  public static void main(String[]args)
  {
    Scanner j=new Scanner(System.in);
    System.out.println("give me a number");
    int a=j.nextInt();
    for(int c=1;c<=a;c++)
    {
       System.out.print(c);
    }
  }
}