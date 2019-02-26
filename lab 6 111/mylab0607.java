import java.util.Scanner;
public class mylab0607
{ public static void main(String[]args)
  {
      Scanner j=new Scanner(System.in);
      System.out.println("give me a big string");
      String a=j.next();
      char s[]=a.toCharArray();
      System.out.println("give me the old char");
      String a1=j.next();
      char old=a1.charAt(0);
      System.out.println("give me the new char");
      String a2=j.next();
      char ne=a2.charAt(0);
      
      for(int c=s.length-1;c>=0;c--)
      {
          if(s[c]==old)
          {
            s[c]=ne;
             break;
          }
         
          
      }
      System.out.println(a);
      System.out.println(s);
     
}
}
      