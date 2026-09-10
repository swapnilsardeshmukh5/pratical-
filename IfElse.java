class SelectionDemo {
    public static void main(String[] args) {
        int num = 10;

        // if statement
        if (num > 0) {
            System.out.println("Number is positive");
        }

        // if-else statement
        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        // else-if ladder
        if (num < 0) {
            System.out.println("Number is negative");
        } else if (num == 0) {
            System.out.println("Number is zero");
        } else {
            System.out.println("Number is positive");
        }

        // switch statement
        int day = 3;  // 1=Mon, 2=Tue, 3=Wed...
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
