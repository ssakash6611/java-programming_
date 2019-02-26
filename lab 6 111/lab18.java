import java.util.Scanner;
public class lab18
{
    public static void main(String[]args)
    {  
         Scanner j=new Scanner(System.in);
         System.out.println("give me a String");
         String a1=j.nextLine();
         char[] a=a1.toCharArray();
         System.out.println("give me a character");
         String b1=j.nextLine();
         char b=b1.charAt(0);
         System.out.println("give me an integer");
         int s=j.nextInt();
         int n=0;
         if(s<0 || s>a.length){
           System.out.println("invalid index");
         }
         else{for(int c=s;c<a.length;c++)
         {
              if(a[c]==b)
              {
                  n=n+1;
                  break;
              }
         
         if(n==1)
         {
              System.out.println(c);
         }
         else
         {
             System.out.println("-1");
         }
         }    
    }
    }
}