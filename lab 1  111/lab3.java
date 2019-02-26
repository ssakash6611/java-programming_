import java.util.Scanner;
public class lab3
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
            System.out.print("*");
        }
    }
}
}