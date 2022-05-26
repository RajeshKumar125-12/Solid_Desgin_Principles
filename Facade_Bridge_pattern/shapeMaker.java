package Facade_Bridge_pattern;

public class shapeMaker 
{
    private shape rectangle_1;
    private shape square_1;
    public shapeMaker()
    {
        rectangle_1=new rectangle();
        square_1=new square();
    }
    public void drawRectangle()
    {
        rectangle_1.draw();

    }
    public void drawSquare()
    {
        square_1.draw();
    }
}
