package Proxy_Design_Pattern;

public class PPDemo 
{
    public static void main(String[] args) 
    {
        image im=new proxyImage("p10.jpg");
        im.display();
        System.out.println("");
        im.display();
        
    }
    
}
