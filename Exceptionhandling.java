import java.util.Scanner;

public class StudentValidation {

    // Custom Exception for Age
    static class AgeException extends Exception {
        public AgeException(int age) {
            super("Invalid Age: " + age + ". Age must be between 18 and 30.");
        }
    }

    // Custom Exception for Department
    static class DeptException extends Exception {
        public DeptException(String dept) {
            super("Invalid Department: " + dept + ". Must be one of [CSE, ECE, IT, MECH].");
        }
    }

    // Validation Method
    public static void validateStudent(int age, String dept) throws AgeException, DeptException {
        if (age < 18 || age > 30) {
            throw new AgeException(age);
        }

        String[] validDepts = {"CSE", "ECE", "IT", "MECH"};
        boolean isValidDept = false;
        for (String valid : validDepts) {
            if (valid.equalsIgnoreCase(dept)) {
                isValidDept = true;
                break;
            }
        }

        if (!isValidDept) {
            throw new DeptException(dept);
        }
    }

    // Main Method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.print("Enter department: ");
            String dept = scanner.nextLine().trim();

            validateStudent(age, dept);
            System.out.println("Validation successful!");

        } catch (AgeException | DeptException e) {
            System.out.println("Validation failed: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
