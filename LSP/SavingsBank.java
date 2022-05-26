package LSP;

public class SavingsBank implements BankTypes
{
    public void showDetails()
    {
        System.out.println("Savings Bank");
    }
    public static void main(String args[])
    {
        BankTypes ob1=new SavingsBank();
        ob1.showDetails();
    }
}