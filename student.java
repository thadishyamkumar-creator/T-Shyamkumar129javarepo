final class Student
{
    final int rollNo = 129;
	final double cgpa = 9.24;
	
    final void display()
    {
        System.out.println("Roll No: " + rollNo);
		System.out.println("CGPA : " + cgpa);
    }

    public static void main(String[] args)
    {
        Student s = new Student();

        s.display();
    }
}