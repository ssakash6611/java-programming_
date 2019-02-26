import java.util.Scanner;
public class lab6
{
    public static void main(String[]args)
    {
        Scanner J=new Scanner(System.in);
        System.out.println("give me a number");
        int a=J.nextInt();
       int r=a-1;
       int q=1;
       for(int c=1;c<=a;c++)
       { System.out.println();
// space loop
         for(int d=1;d<=r;d++)
         
         {
           System.out.print(" ");
         }
         r--;
         for(int e=1;e<=q;e++ )
         {
           System.out.print("*");
         }
          q=q+2;
       }
       int v=a-1;
       
        int y=v-1; 
            
        
         for(int l=1;l<=v;l++)
       { System.out.println();
// space loop
         for(int k=1;k<=y;k++)
         
         {
           System.out.print(" ");
         }
         y++;
         
         for(int m=1;m<=v;m++ )
         {
           System.out.print("*");
         }
         v=v-2;
         }
         
    }
}
    
         
         
    

        