import java.util.Scanner;
public class lab6
{
     public static void main(String[]args)
     {
          Scanner j=new Scanner(System.in);
          System.out.println("give me a String");
          String a=j.next();
          String b="==the end==";
          String d=a.concat(b);
          System.out.println(a);
          System.out.println(d);
          System.out.println(a);
     }
}