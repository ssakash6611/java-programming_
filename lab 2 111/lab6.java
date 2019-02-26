import java.util.Scanner;
public class lab6
{
     public static void main(String[]args)
     {
           Scanner j=new Scanner(System.in);
           int[]a=new int [10];
           System.out.println("give me numbers range:0-9:" );
           for(int c=0;c<=15;c++)
           {
            int num =j.nextInt();
             a[num]++;
           }
           for(int d=0;d<a.length;d++)
           {
             System.out.println(d+"has been entered"+a[d]+"times");
             
           }
     }
}
           