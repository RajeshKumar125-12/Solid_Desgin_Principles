package Proxy_Design_Pattern;

public class proxyImage  implements image
{
    private realImage ri;
    private String fileName;
    public proxyImage(String fileName)
    {
        this.fileName=fileName;
    }
    public void display()
    {
        if(ri==null)
        {
            ri=new realImage(fileName);
        }
        ri.display();
    }

    
}
