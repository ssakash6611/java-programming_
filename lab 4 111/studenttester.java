public class studenttester
{
      public static void main(String[]args)
      {
             student s1=new student();
             s1.setName("John");
             s1.setID("13201015");
             s1.setAddress("maohakhali");
             s1.setCGPA(2.29);
             
             
             student s2=new student();
             s2.setName("Mike");
             s2.setID("13201015");
             s2.setAddress("Gulsan");
             s2.setCGPA(3.3);
             
             System.out.println(s1.getName());
             System.out.println(s1.getID());
             System.out.println(s1.getAddress());
             System.out.println(s1.getCGPA());
             System.out.println();
             System.out.println(s2.getName());
             System.out.println(s2.getID());
             System.out.println(s2.getAddress());
             System.out.println(s2.getCGPA());
      }
}