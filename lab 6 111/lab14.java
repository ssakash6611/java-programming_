import java .util.Scanner;
public class lab14
{
     public static void main(String[]args)
     {
           Scanner j =new Scanner(System.in);
           System.out.println("give me a String");
           String a=j.nextLine();
           char[]a1=a.toCharArray();
           System.out.println("give me an integer");
           int b=j.nextInt();
           for(int c=b;c<a1.length;c++)
           {
             System.out.print(a1[c]);
           }
     }
}