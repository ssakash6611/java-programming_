public class Vehicle2010 extends Vehicle
{
  public void moveUpperLeft()
  {
     moveLeft();
     moveUp();
  }
    public void moveUpperRight()
  {
     moveRight();
     moveUp();
  }
     public void moveLowerLeft()
  {
     moveLeft();
     moveDown();
  }
       public void moveLowerRight()
  {
     moveRight();
     moveDown();
  }
       public boolean equals(Vehicle2010 v)
       {
         if(v.x==this.x && v.y==this.y)
         {
           return true;
         }
         else
         {
           return false;
         }
       }
}