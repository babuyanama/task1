import java.util.*;

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

class Admin extends User {
    public Admin(String username, String password) {
        super(username, password);
    }
}

class Student extends User {
    private int rollNumber;
    private String branch;
    private int semester;
    private int year;

    public Student(String username, String password, int rollNumber, String branch, int semester, int year) {
        super(username, password);
        this.rollNumber = rollNumber;
        this.branch = branch;
        this.semester = semester;
        this.year = year;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getBranch() {
        return branch;
    }

    public int getSemester() {
        return semester;
    }

    public int getYear() {
        return year;
    }
}

class SeatingArrangementSystem {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<String, String> adminCredentials = new HashMap<>();
    private static Map<String, Student> students = new HashMap<>();

    public static void main(String[] args) {
        // Sample admin credentials
        adminCredentials.put("admin", "password");

        boolean exit = false;
        while (!exit) {
            System.out.println("1. Admin Login");
            System.out.println("2. Student Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    adminLogin();
                    break;
                case 2:
                    studentLogin();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void adminLogin() {
        System.out.print("Enter admin username: ");
        String username = scanner.nextLine();
        System.out.print("Enter admin password: ");
        String password = scanner.nextLine();

        if (adminCredentials.containsKey(username) && adminCredentials.get(username).equals(password)) {
            adminMenu();
        } else {
            System.out.println("Invalid username or password!");
        }
    }

    private static void adminMenu() {
        // Admin functionalities can be implemented here
        System.out.println("Admin menu");
    }

    private static void studentLogin() {
        System.out.print("Enter student username: ");
        String username = scanner.nextLine();
        System.out.print("Enter student password: ");
        String password = scanner.nextLine();

        if (students.containsKey(username) && students.get(username).getPassword().equals(password)) {
            studentMenu(students.get(username));
        } else {
            System.out.println("Invalid username or password!");
        }
    }

    private static void studentMenu(Student student) {
        // Student functionalities can be implemented here
        System.out.println("Student menu for " + student.getUsername());
    }
}
