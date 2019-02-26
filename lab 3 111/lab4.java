import java.util.Scanner;
public class lab4
{
     public static void main(String[]args)
     {
           Scanner j=new Scanner(System.in);
           System.out.println("give me a String");
           String z=j.next();
           int []s=new int[26];
           
           for(int b=0;b<z.length();b++)
             {
           
                for(int c=65;c<=90;c++)
                {
                
                      if(c==(int)z.charAt(b))
                      {
                        s[c-65]++;
                      }
               }
           }
            for(int i=65;i<=90;i++)
            {
              System.out.println((char)i+" which is "+i+"was found "+s[i-65]+" times");
            }
     }
}