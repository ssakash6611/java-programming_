import java.util.Scanner;
public class mylab0608
  
{ public static void main(String[]args)
  {
      Scanner j=new Scanner(System.in);
      System.out.println("give me a big string");
      String a=j.next();
      char []s=a.toCharArray();
      for(int c=0;c<s.length;c++)
      {
          s[c]= (char)((int)s[c]+32);
          
      }
      for(int d=0;d<s.length;d++)
      {
        System.out.print(s[d]);
        
      }
}
}