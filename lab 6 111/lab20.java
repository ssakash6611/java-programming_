import java.util.Scanner;
public class lab20
{ public static void main(String[]args)
  {
      Scanner j=new Scanner(System.in);
      System.out.println("give me a string");
      String a1=j.nextLine();
      char a[]=a1.toCharArray();
      System.out.println("give me a string");
      String b1=j.nextLine();
      char b[]=b1.toCharArray();
      int n=a.length+b.length;
      char v[]=new char[n];
      for(int c=0;c<a.length;c++)
      {
          v[c]=a[c];
      }
      int z=0;
      for(int d=a.length;d<n;d++)
      {
        v[d]=b[z];
        z=z+1;
      }
      for(int h=0;h<n;h++)
      {
        System.out.print(v[h]);
      }
}
}
      