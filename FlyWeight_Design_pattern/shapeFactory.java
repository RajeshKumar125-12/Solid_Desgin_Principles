package FlyWeight_Design_pattern;

//import javax.print.attribute.HashAttributeSet;

import java.util.HashMap;

public class shapeFactory 
{
    private static final HashMap<String, shape> circleMap= new HashMap();

    public static shape  getCircle(String color)
    {
        circle c=(circle)circleMap.get(color);
        if(c==null)
        {

            c=new circle(color);
            circleMap.put(color,c);
            System.out.println("Creating circle of color "+color);

        }
        return c;

    }
    
}
