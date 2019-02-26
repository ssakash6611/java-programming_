public class circle extends Point{
  public circle(double c)
  {
     super(c);
  }
  public double space()
  {
      System.out.println("Creating a Circle … done!");
      return Math.PI*getRadius()*getRadius();
  }
}