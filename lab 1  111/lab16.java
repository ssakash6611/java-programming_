import java.util.Scanner;
public class lab16
{
    public static void main(String[]args)
    {
        Scanner J=new Scanner(System.in);
        System.out.println("give me a number");
        int a=J.nextInt();
       int r=a-1;
       for(int c=1;c<=a;c++)
       { System.out.println();
// space loop
         for(int d=1;d<=r;d++)
         
         {
           System.out.print(" ");
         }
         r--;
         for(int e=1;e<=c;e++ )
         {
           System.out.print(e);
         }
          
         
            }
        }
}
