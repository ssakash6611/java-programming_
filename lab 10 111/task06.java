import java.util.Scanner;
import java.io.*;
public class task06
{
    public static void main(String[]args)
    {
      try{
        String myfile="F:\\CSE 111 mylabs\\lab 10 111\\myfile.txt";
        File f=new File(myfile);
        Scanner j=new Scanner(f);
        while(j.hasNextLine())
        {
          System.out.println(j.nextLine());
        }
      }
        catch(IOException e)
        {
          System.out.println(e);
        }
      
    }
}