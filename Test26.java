interface Canplay
{
	void play();
}
interface Canread
{
	void read();
}

class Shyam implements Canplay,Canread
{
	public void play()
	{
		System.out.println("Shyam can play");
	}
	public void read()
	{
		System.out.println("Shyam can read");
	}
}
class Test26
{
		public static void main(String[] args)
		{
			Shyam s=new Shyam();
			
			s.play();
			s.read();
		}
}