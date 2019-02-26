import java.util.Scanner;
public class lab9
{
      public static void main(String[]args)
      {
            Scanner j =new Scanner(System.in);
            int []a=new int[10];
            for(int c=0;c<=a.length-1;c++)
            {
                  a[c]=j.nextInt();
            }
            for(int d=0;d<=a.length-1;d++)
            {
                 if(a[d]%2!=0)
                 { 
                   System.out.print(a[d]+",");
                 }
            }
            for(int e=0;e<=a.length-1;e++)
            { 
              if(a[e]%2==0)
              {
                System.out.print(a[e]+",");
              }
            }
      }
}