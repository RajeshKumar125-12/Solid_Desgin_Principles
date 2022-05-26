package Builder_Design_pattern;

public class Phone 
{

    private String os;
    private int ram;
    private int battery;
    public Phone(String os,int ram,int battery)
    {
        
        this.os=os;
        this.ram=ram;
        this.battery=battery;
    }
    public void display()
    {
        System.out.println("Phone: [OS="+os+" RAM="+ram+" Battery="+battery+" ]");
    }

    
}
