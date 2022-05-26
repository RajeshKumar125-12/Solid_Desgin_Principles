package Bridge_Design_Pattern;

public class circle extends shape
{
    private int radius,x,y;
    public circle(int x,int y,int radius,drawApi da)
    {
        super(da);
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    public void draw()
    {
        da.drawCircle(radius,x,y);
    }
    
}
