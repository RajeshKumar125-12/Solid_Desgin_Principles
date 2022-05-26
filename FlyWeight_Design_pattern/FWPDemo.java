package FlyWeight_Design_pattern;

public class FWPDemo 
{
    private static final String colors[]={"Red","Black","Blue"};
    public static void main(String[] args) 
    {
        for(int i=0;i<20;i++)
        {
            circle c=(circle)shapeFactory.getCircle(getRandomColor());
            c.setX(getRandomX());
            c.setY(getRandomY());
            c.setRadius(100);
            c.draw();

        }
        
    }
    private static String getRandomColor()
    {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX()
    {
        return (int)(Math.random()*100);
    }
    private static int getRandomY()
    {
        return (int)(Math.random()*100);
    }
    
    
}
