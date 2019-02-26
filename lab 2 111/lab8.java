import java.util.Scanner;
public class lab8
{
     public static void main(String[]args)
     {
           Scanner j=new Scanner(System.in);
           int[]a=new int [10];
           for(int c=0;c<=a.length-1;c++)
           {
              int num=j.nextInt();
             int v=0;
             for(int b=0;b<=a.length-1;b++)
             {
                if(num==a[b])
                {
                  v=v+1;
                }
             }
             if(v==0)
             {
               a[c]=num;
               System.out.println(a[c]);
               
             }
             else
             {
               System.out.println("duplicate.Please give me another number");
             }
                
             }
           }
}