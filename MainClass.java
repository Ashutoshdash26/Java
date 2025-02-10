class Student {
    private String name; // Private variable

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }
}
public class MainClass {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("John"); // Setting value using setter
        System.out.println("Student Name: " + s.getName()); // Accessing using getter
    }
}

