package FlyWeight_Design_pattern;

public class circle implements shape
 {
     private String color;
     private int x;
     private int y;
     private int radius;
     public circle(String color)
     {
         this.color=color;
     }
     public void setX(int x)
     {
         this.x=x;
     }
     public void setY(int y)
     {
         this.y=y;
     }
     public void setRadius(int radius)
     {
         this.radius=radius;
     }
    
     public void draw()
     {
         System.out.println("Circle drawn , radius="+radius+"["+x+","+y+"]");
     }

}
