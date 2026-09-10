class Student {
    String name;
    int rollNo;
    String course;

    // Default constructor
    Student() {
        name = "Unknown";
        rollNo = 0;
        course = "Not Assigned";
    }

    // Constructor with 2 parameters
    Student(String n, int r) {
        name = n;
        rollNo = r;
        course = "Not Assigned";
    }

    // Constructor with 3 parameters
    Student(String n, int r, String c) {
        name = n;
        rollNo = r;
        course = c;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Course: " + course);
    }
}

class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        // Using default constructor
        Student s1 = new Student();

        // Using 2-argument constructor
        Student s2 = new Student("Rahul", 101);

        // Using 3-argument constructor
        Student s3 = new Student("Priya", 102, "Computer Science");

        // Display details
        s1.display();
        s2.display();
        s3.display();
    }
}
