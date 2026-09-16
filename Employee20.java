class Employee20{
	int empid;
	String name;
	double salary;
	Employee20(int id, String n, double sal){
		empid=id;
		name=n;
		salary=sal;
	}
	void display(){
		System.out.println("id:%d |name:%s|salary:%2f",empid,name,salary);
	}
	static void companyname(){
		System.out.println("anits engineering college");
	}
}
	