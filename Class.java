class Student 
{
    // Data members (attributes)
    String name;
    int rollNo;

    // Method to display student details
    void displayDetails() 
    {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}

// Main class
class ClassObjectDemo 
{
    public static void main(String[] args) 
    {
        // Creating object of Student class
        Student s1 = new Student();

        // Assigning values
        s1.name = "Rahul";
        s1.rollNo = 101;

        // Calling method using object
        s1.displayDetails();
    }
}
