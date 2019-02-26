import java.util.*;
public class Task04{
    public static void main(String[]args){
        String kisuShongkha = "74.5                89          \n    45";
        StringTokenizer a=new  StringTokenizer(kisuShongkha," \n");
        while(a.hasMoreTokens()){
            System.out.println(a.nextToken());
        }
        String golpo = "still you can find some teachers who dislike such co-curricular \n"+"activities like Programming Contests. They do not understand contests are\n"+"far more interesting and challenging than whatever slides he was showing in the classroom.\n"+"To be a good contestant, one needs to be resourceful."+"Apart from a working brain, the primary resource for a contestant would be books.\n"+"And a good source of books and training materials is the Internet.";
        StringTokenizer a1=new StringTokenizer(golpo,"\n");
        while(a1.hasMoreTokens())
        {
            System.out.println(a1.nextToken());
        }
        String s="23 3 8 20 32";
        int sum=0;
        StringTokenizer a2=new StringTokenizer(s," ");
        while(a2.hasMoreTokens())
        {
            sum+=Integer.parseInt(a2.nextToken());
        }
        System.out.println(sum);
    }
}