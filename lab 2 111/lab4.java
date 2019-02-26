import java.util.Scanner;
public class lab4
{   
     public static void main(String[]args)
     {
           Scanner j=new Scanner(System.in);
           int []a=new int[20];
            System.out.println("give me numbers");
            for(int c=0;c<a.length;c++)
           {
               
                a[c]=j.nextInt();
                
           }
            for(int d=a.length-1;d>=0;d--)
              {  
                 if(a[d]%2==0)
                 System.out.println(a[d]);
              }
     }
}