class A
	{
		int i=10;
		int j=20;
		
		void m()
		{
			System.out.println(i+j);
		}
	}	
		
class B extends A
{
	void m1()
	{
		System.out.println(i+j);
	}
}
class Test19
{
	public static void main(String[] args)
	{
		B b = new B();
		System.out.println(b.i);
		System.out.println(b.j);
		b.m1();
		b.m();
	}
}	