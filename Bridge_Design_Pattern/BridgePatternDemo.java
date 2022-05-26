package Bridge_Design_Pattern;

public class BridgePatternDemo 
{
    public static void main(String[] args) 
    {
        shape redCircle=new circle(100,100,10,new redCircle());
        redCircle.draw();
        
    }
    
}
