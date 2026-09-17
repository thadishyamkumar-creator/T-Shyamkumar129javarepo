class ClassandObject{
     int rollno;
	 String name;
	 double cgpa;
	 void display(){
		 System.out.println("Roll:"+ rollno + "Name:" + name + "CGPA:"  + cgpa);
	 }
}
		 class Main{
	public static void main(String[] args){
		ClassandObject s1= new ClassandObject();
		s1.rollno=129;
		s1.name="Shyam";
		s1.cgpa=9.23;
		s1.display();
	}
}