import java.util.Scanner;
public class lab14
{
  public static void main(String[]args)
  {
    Scanner j=new Scanner(System.in);
    System.out.println("give me a number");
    int a=j.nextInt();
    for(int b=1;b<=a;b++)
    {
        System.out.println();
        {
             for (int c=1;c<=b;c++)
             {
                  System.out.print(c);
             }
        }
    }
  }
}