package Decorator_Design_Pattern;

public class DDemo 
{
    public static void main(String[] args) 
    {
        shape circle = new circle();
        shape redCircle=new redShapeDecorator(new circle());
        System.out.println("Cirlce with normal border");
        circle.draw();
        System.out.println("Circle with Red Border");
        redCircle.draw();
        
    }
    
}
