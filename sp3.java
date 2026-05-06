
    public static void main(String[] args) {

        String name = "Sam";
        int rollNumber = 1;
        double percentMarks = 99.99;
        char result = 'P';   // 'P' for Pass, 'F' for Fail

        System.out.println("Student Name  : " + name);
        System.out.println("Roll Number   : " + rollNumber);
        System.out.println("Percent Marks : " + percentMarks);
        System.out.println("Result        : " + result);

        // Checking Pass or Fail
        if (result == 'P') {
            System.out.println("Status        : Pass");
        } else {
            System.out.println("Status        : Fail");
        }
    }
}