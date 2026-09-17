class ByteToCharCasting
{
    public static void main(String[] args)
	{
        byte b = 28;
        char c = (char) b; 

        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("ASCII value of c = " + (int)c);
    }
}