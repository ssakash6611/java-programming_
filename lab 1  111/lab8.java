import java.util.Scanner;
public class lab8
{
    public static void main(String[]args)
    {
        Scanner J=new Scanner(System.in);
        System.out.println("give me a number");
        int a=J.nextInt();
      
        for(int d=1;d<=a;d++)
        {
          System.out.println();
          
        for (int c=1;c<=d;c++)
        { 
          if(d==1||c==1||d==a||c==d)
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