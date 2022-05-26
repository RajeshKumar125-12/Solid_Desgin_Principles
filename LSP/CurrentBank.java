package LSP;


public class CurrentBank implements BankTypes
{
    public void showDetails()
    {
        System.out.println("Current Bank");
    }
    public static void main(String args[])
    {
        BankTypes ob1=new CurrentBank();
        ob1.showDetails();
    }
}