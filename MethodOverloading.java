class MathOperation {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }
    // Overloaded method: add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
    // Overloaded method: add two double values
    double add(double a, double b) {
        return a + b;
    }
}
class MethodOverloadingDemo {
    public static void main(String[] args) {
        MathOperation mo = new MathOperation();

        // Calling different versions of add method
        System.out.println("Sum of 2 integers: " + mo.add(10, 20));
        System.out.println("Sum of 3 integers: " + mo.add(10, 20, 30));
        System.out.println("Sum of 2 doubles: " + mo.add(5.5, 4.5));
    }
}
