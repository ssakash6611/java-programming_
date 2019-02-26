import java .util.Scanner;
public class lab12
{
     public static void main(String[]args)
     {
           Scanner j =new Scanner(System.in);
           System.out.println("give me a String");
           String a=j.next();
           System.out.println("give me a another String");
           String b=j.next();
           char[]a1=a.toCharArray();
           char[]b1=b.toCharArray();
           int sum=0;
           for(int c=0;c<a1.length;c++)
           {
             if((int)a1[c]==(int)b1[c])
             {
               sum=sum+0;
             }
             else if((int)a1[c]>(int)b1[c])
             {
               sum=sum+((int)a1[c]-(int)b1[c]);
             }
             else if((int)a1[c]<(int)b1[c])
             {
               sum=sum+((int)a1[c]-(int)b1[c]);
             }
           }
           System.out.println(sum);
     }
}