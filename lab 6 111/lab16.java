import java.util.Scanner;
public class lab16
{ public static void main(String[]args)
  {
      Scanner j=new Scanner(System.in);
      System.out.println("give me a string");
      String a=j.next();
      char s[]=a.toCharArray();
      System.out.println("give me a character");
      String a1=j.next();
      char ch=a1.charAt(0);
      int n=0;
      
      for(int c=0;c<s.length;c++)
      {
          n=n+1;
          if(s[c]==ch)
          { 
            break; 
          }
      }
      if(s[n-1]==ch)
      {
        System.out.println(n);
      }
      else
      {
        System.out.println(-1);
      }
}
}