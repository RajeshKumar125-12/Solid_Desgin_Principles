package Singleton_Design_Pattern;

public class Demo 
{
    public static void main(String args[])
    {
     //Home ob1=new  Home() 
     Home ob1=Home.getInstance();
     //Home ob2=Home.getInstance();
    }

    
}
class Home
{
     //static  Home obj=new Home();
     static  Home obj;
     private Home()
     {
        System.out.println("Instance Created");
     }
     public static Home getInstance()
     {
         if(obj==null)
            obj=new Home();
         return obj;
     }

}
