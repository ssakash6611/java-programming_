import java.util.Scanner;
public class mylab0604
{ public static void main(String[]args)
  {
      Scanner j=new Scanner(System.in);
      System.out.println("give me a big string");
      String a1=j.next();
      System.out.println("give me a small string");
      String a2=j.next();
      boolean f=true;
      
      
      char[] b1=a1.toCharArray();
      char[] b2=a2.toCharArray(); 
      int x=b1.length-1;
      for(int c=b2.length-1;c>=0;c--)
      {
        if(b2[c]==b1[x])
        {
          f=true;
        }
        else
        {
          f=false;
        }
        x--;
      }
        
      System.out.println(f);
}
}