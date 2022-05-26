package Composite_Design_Pattern;

public class CPDemo 
{
    public static void main(String[] args) 
    {
        Employee CEO=new Employee("John", "CEO",30000);
        Employee headSales=new Employee("Robert", "Head Sales",20000);
        Employee headMarketing=new Employee("Michael", "Head Marketing",10000);
        Employee clerk1=new Employee("Laura", "Marketing",10000);
        Employee clerk2=new Employee("Bob", "Marketing",10000);
        Employee salesExecutive1=new Employee("Richard", "sales",10000);
        Employee salesExecutive2=new Employee("Rob", "sales",10000);


        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        System.out.println(CEO);  //print all employees

        for(Employee h:CEO.getSubordinates())
        {
            System.out.println(h);
            for(Employee e:h.getSubordinates())
            {
                System.out.println(e);
            }
        }
        
    }
    
}
