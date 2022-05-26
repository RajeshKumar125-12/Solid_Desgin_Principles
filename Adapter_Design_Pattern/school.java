package Adapter_Design_Pattern;

public class school 
{
    public static void main(String[] args) 
    {
        pen p=new penAdapter();
        AssignmentWork aw=new AssignmentWork();
        aw.setP(p);
        aw.writeAssignemnt("I am lazy");

        
    }
    
}
