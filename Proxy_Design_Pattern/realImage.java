package Proxy_Design_Pattern;

public class realImage implements image
{
    private String fileName;
    public realImage(String fileName)
    {
        this.fileName=fileName;
        loadFromDisk(fileName);
    }
    public void display()
    {
        System.out.println("Displaying-"+fileName);
    }
    private void loadFromDisk(String fileName)
    {
            System.out.println("Loading"+fileName);
    }
    
}
