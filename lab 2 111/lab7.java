import java.util.Scanner;
 public class lab7
    {
         public static void main(String args[])
         {
              Scanner j= new Scanner(System.in);
              int a[] = new int [10];
              System.out.println("give me numbers");
              for(int c=0; c<=a.length-1;c++)
              {
                  a[c]=j.nextInt();
              }
              for(int d=0;d<=a.length-1;d++)
              {
                  System.out.println(a[d]);
              }
         }
 }
 