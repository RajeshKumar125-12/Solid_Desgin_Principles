package builderDP2;

public class BPaDemo 
{
    public static void main(String[] args) 
    {
        mealBuilder m1=new mealBuilder();
        meal vegm=m1.prepVegMeal();
        System.out.println("Veg Meal");
        vegm.showItems();
        System.out.println("Total Cost: "+vegm.getCost());
        
        
        meal nonvegm=m1.prepNonVegMeal();
        System.out.println("\n\nNon Veg Meal");
        nonvegm.showItems();
        System.out.println("\nTotal Cost: "+nonvegm.getCost());
    }
    
}
