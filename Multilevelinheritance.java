class A
{
	int i,j;
	A(int k,int l)
	{
		i=k;
		j=l;
	}
	
	void m()
	{
		System.out.println(i+j);
	}
}	
class B extends A
{
	B(int k,int l)
	{
		super(k,l);
	}
	void m1()
	{
	System.out.println(i+j);
	}
}	
class C extends B
{
	C(int k,int l)
	{
		super(k,l);
	}
	void m2()
	{
	System.out.println(i+j);
	}
}	
class Multilevelinheritance
{
	public static void main(String[] args)
	{
		C c = new C(10,20);
		c.m();
		c.m1();
		c.m2();
	}
}
