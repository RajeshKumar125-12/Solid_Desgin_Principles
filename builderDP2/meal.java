package builderDP2;

import java.util.*;
public class meal 
{
    private List<item> i=new ArrayList<item>();

    public void addItem(item it)
    {
        i.add(it);

    }
    public float getCost()
    {
        float cost=0.0f;
        for(item i2:i)
            cost+=i2.price();

        return cost;
    }
    public void showItems()
    {
        for(item i2:i)
        {
            System.out.println("\nItem: "+i2.name());
            // System.out.println("Packing: "+i2.packing().pack());
            System.out.println("Price: "+i2.price());
            
        }
    }
    
}
