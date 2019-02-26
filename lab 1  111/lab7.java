import java.util.Scanner;
public class lab7
{
  public static void main(String[]args)
  {
    Scanner J=new Scanner(System.in);
    System.out.println("give me a number");
    int a=J.nextInt();
    System.out.println("give me a number");
    int b=J.nextInt();
    for(int d=1;d<=a;d++)
    {
      System.out.println();
      
      for (int c=1;c<=b;c++)
      { 
        if(d==1||c==1||d==a||c==b)
        {
          System.out.print("*");
        }
        else
        {
          System.out.print(" ");
        }
      }
    }
  }
}