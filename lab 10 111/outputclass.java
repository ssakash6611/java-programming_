import java.io.*;
public class outputclass{
  public static void main(String [] args){
    try{
      File f= new File("F:\\CSE 111 mylabs\\lab 10 111\\myfile2.txt");
    PrintWriter p = new PrintWriter(f);
    p.write("hello");
    p.write("world");
    p.write("bye");
    p.close();
    }
    catch(IOException e){
    System.out.println(e);
    }
  }
}