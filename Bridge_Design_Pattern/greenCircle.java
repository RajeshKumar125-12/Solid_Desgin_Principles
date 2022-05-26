package Bridge_Design_Pattern;

public class greenCircle  implements drawApi
{
    
    public void drawCircle(int radius,int x,int y)
    {
        System.out.println("Color green, radius- "+radius+" ("+x+","+y+")");
    }
    
}
