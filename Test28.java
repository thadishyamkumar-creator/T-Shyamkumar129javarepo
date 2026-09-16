class Student {
    int    rollNo;
    String name;
    double cgpa;

    Student() {                        
        rollNo = 0; name = "Unknown"; cgpa = 0.0;
    }
    Student(int r, String n) {   
        rollNo = r; name = n; cgpa = 0.0;
    }
    Student(int r, String n, double g) { 
        rollNo = r; name = n; cgpa = g;
    }
    void show() {
        System.out.printf("%d | %s | %.2f%n", rollNo, name, cgpa);
    }
}

public class Test28 {
    public static void main(String[] args) {
        new Student().show();
        new Student(101, "Arjun").show();
        new Student(102, "Priya", 9.2).show();
    }
}