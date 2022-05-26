package Bridge_Design_Pattern;

public abstract class shape
 {
     protected drawApi da;
     protected shape(drawApi da)
     {
         this.da=da;
     }
     public abstract void draw();
    
}
