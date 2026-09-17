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
	int k=30;
	
	void m1()
	{
		System.out.println(i+j+k);
	}
}	
class C extends A
{
	int l=40;
	
	void m2()
	{
		System.out.println(i+j+l);
	}
}
class HierarchicalInheritance
{
		public static void main(String[] args)
		{
			C c = new C();
			System.out.println(c.i);
			System.out.println(c.j);
			System.out.println(c.l);
			
			c.m();
			c.m2();
		}
}		