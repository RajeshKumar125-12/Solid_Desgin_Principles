package Adapter_Design_Pattern;

public class AssignmentWork 
{
    private pen p;
    public void setP(pen p)
    {
        this.p=p;
    }
    public pen getP()
    {
        return p;
    }
    public  void writeAssignemnt(String str)
    {
        p.write(str);

    }
    
}
