package jdbc.student.management;

/**
 * Model Class (POJO - Plain Old Java Object)
 * Represents a single Student record from the database.
 */
public class Student {
    private int id;
    private String name;
    private int age;
    private String course;

    // Constructors
    public Student() {}

    public Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public Student(String name, int age, String course) {
        // ID is auto-incremented in DB, so we don't always need it
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    
    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    @Override
    public String toString() {
        return "Student [ID=" + id + ", Name=" + name + ", Age=" + age + ", Course=" + course + "]";
    }
}
