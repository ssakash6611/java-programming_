public class Student implements StInterface
{
    public String name;
    public String id;
    public String addressfield;
    public void setName(String n)
    {
       name=n;
    }
    public void setID(String i)
    {
        id=i;
    }
    public void setAddressField(String m)
    {
      addressfield=m;
    }
    public String getName()
    {
         return name;
    }
    public String getID()
    {
        return id;
    }
    public String getAddressField()
    {
       return addressfield;
    }
}