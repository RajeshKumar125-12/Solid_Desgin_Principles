package Decorator_Design_Pattern;

public class redShapeDecorator extends shapeDecorator
{
    public redShapeDecorator(shape decorateShape)
    {
        super(decorateShape);
    }
    public void draw()
    {
        decorateShape.draw();
        setRedBorder(decorateShape);
    }
    private void setRedBorder(shape decorateShape)
    {
        System.out.println("Border Color:Red");

    }
    
}
