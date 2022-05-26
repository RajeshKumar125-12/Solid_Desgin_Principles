package Bridge_Design_Pattern;

public class redCircle implements drawApi
{
    public void drawCircle(int radius,int x,int y)
    {
        System.out.println("Color red, radius- "+radius+" ("+x+","+y+")");
    }
    
}
