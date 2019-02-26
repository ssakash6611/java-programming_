import java.util.Scanner;
public class lab17
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
      
      for(int c=s.length-1;c>=0;c--)
      {
          n=n-1;
          if(s[c]==ch)
          { 
            break; 
          }
      }
       System.out.println(a.length());
      int f=a.length()+1+n;
      if(s[f-1]==ch)
      {
        System.out.println(f);
      }
      else
      {
        System.out.println(-1);
      }
}
}