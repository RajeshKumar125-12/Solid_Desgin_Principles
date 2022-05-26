package Decorator_Design_Pattern;

public  abstract class shapeDecorator implements shape
{
    protected shape decorateShape;
    public shapeDecorator(shape decorateShape)
    {
        this.decorateShape=decorateShape;
    }
    public void draw()
    {
        decorateShape.draw();
    }
    
}
