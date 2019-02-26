public class sphare extends Point{
  public sphare(double s)
  {
     super(s);
  }
  public double space()
  {
      System.out.println("Creating a Sphere … done!");
      return 4/3*Math.PI*getRadius()*getRadius()*getRadius();
  }
}