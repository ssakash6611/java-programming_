public class studenttester
{
     public static void main(String[]args)
     {
          Student a=new Student();
          a.setName("Akash");
          a.setID("123");
          a.setAddressField("mohakhali");
          Student a1=new Student();
          a1.setName("jack");
          a1.setID("321");
          a1.setAddressField("gulshan");
            
          Student[]b=new Student[2];
          b[0]=a;
          b[1]=a1;
          for(int c=0;c<b.length;c++)
          {
              System.out.println(b[c].name);
              System.out.println(b[c].id);
              System.out.println(b[c].addressfield);
          }
     }
}
            
          