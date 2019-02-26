import java.util.*;
public class Task05{
    public static void main(String[]args){
       String kisuShongkha = "74.5                89          \n    45";
       String[]a=kisuShongkha.split(" |\n");
       for(int c=0;c<a.length;c++)
       {
         System.out.print(a[c]+",");
       }
       String golpo = "still you can find some teachers who dislike such co-curricular \n"+"activities like Programming Contests. They do not understand contests are\n"+"far more interesting and challenging than whatever slides he was showing in the classroom.\n"+"To be a good contestant, one needs to be resourceful."+"Apart from a working brain, the primary resource for a contestant would be books.\n"+"And a good source of books and training materials is the Internet.";
       String[]a1=golpo.split("\n");
       for(int c=0;c<a1.length;c++)
       {
         System.out.println(a1[c]);
       }
       String s="23 3 8 20 32";
        int sum=0;
        String[]a2=s.split(" ");
        for(int c=0;c<a2.length;c++)
        {
           sum+=Integer.parseInt(a2[c]);
        }
        System.out.println(sum);
        }
               
    }
