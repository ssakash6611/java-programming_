import java.util.Scanner;
class Task3
{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        try{
        int x,n=sc.nextInt();
        int a[]=new int[n];
        
        a[5]=99;
        x=n/0;
        }
        catch(ArithmeticException v)
        {
          System.out.println(v);
        }
        catch(ArrayIndexOutOfBoundsException n)
        {
          System.out.println(n);
        }
        finally
        {
          System.out.println("THE END");
        }
    }
}
