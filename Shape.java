class Shape
{
    String colour;

    Shape(String colour)
    {
        this.colour = colour;
    }

    void draw()
    {
        System.out.println("Drawing " + colour + " shape");
    }
}

class Rectangle extends Shape
{
    double width, height;

    Rectangle(String colour, double w, double h)
    {
        super(colour);
        width = w;
        height = h;
    }

    void draw()
    {
        super.draw();
        System.out.println("Rectangle: " + width + "x" + height);
    }

    public static void main(String[] args)
    {
        Rectangle r = new Rectangle("Red", 10, 5);

        r.draw();
    }
}