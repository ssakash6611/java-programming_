public class Tester
{
    public int sum=0;

    public Tester(int a)
    {
      int v=a;
      while(true)
      {
       
        int l=a;
            int n=0;
            while(a>0)
            {
              a=a/10;
              n+=1;
            }
            int[]o=new int[n];
            for(int t=0;t<o.length;t++)
            {
               o[t]=l%10;
               l=l/10;
            }
           sum=0;
            for(int t=0;t<o.length;t++)
                {
                  sum=sum+(o[t]*o[t]);
                 }
             a=sum;
            if(sum==1 || sum==v)
             {
              break;
              }
            }
    
      if(sum==1)
      {
        System.out.println(v+" is a Happy number");
      }
      else
      {
        System.out.println(v+" is an unhappy number");
      }
    }
}
      