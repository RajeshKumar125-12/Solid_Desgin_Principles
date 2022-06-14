package builderDP2;

public class mealBuilder 
{
    public meal prepVegMeal()
    {
        meal m=new meal();
        m.addItem(new vegBerger());
        m.addItem(new coke());
        return m;
    }
    public meal prepNonVegMeal()
    {
        meal m=new meal();
        m.addItem(new chickenBurger());
        m.addItem(new pepsi());
        return m;
    }

    
}
