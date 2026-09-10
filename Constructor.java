class Student {
    String name;
    int rollNo;

    // Default Constructor
    Student() {
        name = "Unknown";
        rollNo = 0;
    }

    // Parameterized Constructor
    Student(String n, int r) {
        name = n;
        rollNo = r;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }	
}
class ConstructorDemo {
    public static void main(String[] args) {
        // Using default constructor
        Student s1 = new Student();

        // Using parameterized constructor
        Student s2 = new Student("Rahul", 101);

        // Displaying values
        s1.display();
        s2.display();
    }
}
