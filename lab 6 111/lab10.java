import java.util.Scanner;
public class lab10
    {
       public static void main(String[]args)
       {
            Scanner j=new Scanner(System.in);
            System.out.println("give me a string");
            String a=j.next();
            System.out.println("give me a another String");
            String b=j.next();
            char[] a1=a.toCharArray();
            char[]b2=b.toCharArray();
            boolean f=true;
            for(int c=0;c<a1.length;c++)
            {
                if(a1[c]==b2[c])
                {
                    f=true;
                }
                else
                {
                  f=false;
                    break;
                }
            }
              System.out.println(f);
       }
}
  