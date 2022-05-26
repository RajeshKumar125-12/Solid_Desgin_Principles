package Builder_Design_pattern;

public class Shop 
{
    public static void main(String args[])
    {
       // Phone p=new Phone("a",2,3);
        //p.display();
        
        Phone p=new PhoneBuilder().setOs("Windows").getPhone();
        p.display();
    }
    
}
