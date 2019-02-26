import java.util.Scanner;
public class lab5
{   
     public static void main(String[]args)
     {
           Scanner j=new Scanner(System.in);
           int []a=new int[10];
            System.out.println("give me numbers");
            for(int c=0;c<=a.length-1;c++)
           {
               
                a[c]=j.nextInt();
                
           }
            System.out.println("give me the finding number");
            int f=j.nextInt();
            int n=0;
             for(int d=0;d<=a.length-1;d++)
                {
               
                   if(f==a[d])
                   {
                     n=n+1;
                   break;
                }
             }
                   if(n==1)
                   {
                     System.out.println("yes");
                   }
                   else
                   {
                     System.out.println("no");
                   }
                     
                
                
     }
}
