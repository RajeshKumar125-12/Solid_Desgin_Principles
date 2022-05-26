package Adapter_Design_Pattern;

public class penAdapter implements pen
{
    pilotPen pp=new pilotPen();
    
    public void write(String str)
    {
        pp.mark(str);

    }
    
}
