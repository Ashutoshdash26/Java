class Student {
    private String name; 

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }
}
public class MainClass {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("John"); 
        System.out.println("Student Name: " + s.getName()); 
    }
}

