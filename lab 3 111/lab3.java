import java.util.Scanner;
public class lab3
{
     public static void main(String[]args)
     {
           Scanner j=new Scanner(System.in);
          
       String a=j.nextLine();
           for(int c=0;c<=a.length()-1;c++)
           {
               System.out.println(a.charAt(c)+":"+a.codePointAt(c));
           }
     }
}