class A
{
	int m(int i,int k)
	{
		return i+k;
		}
		double m(float j,float l)
		{
		return j+l;
		}
}
class Methodoverloading
{
		public static void main(String[] args)
		{
			A a = new A();
			//a.m(10,20);
			//a.m(10.4f,20.4f);
			System.out.println(a.m(10,20));
			System.out.println(a.m(10.4f,20.4f));
		}
}		