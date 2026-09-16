interface Shape
{
	void area();
}
class Circle implements Shape
{
		public void area()
		{
			System.out.println("Area of circle");
		}
}
class Rectangle implements Shape
{
		public void area()
		{
			System.out.println("Area of Rectangle");
		}
}
class Test25
{
	public static void main(String[] args)
	{
		Shape s1=new Circle();
		Shape s2=new Rectangle();
		s1.area();
		s2.area();
	}
}	