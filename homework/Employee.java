package newPro.lesson2.homework;

public class Employee {
    private String fullName;
    private String post;
    private String email;
    private int phoneNumber;
    private int salary;
    private int age;

    public int getAge() {
        return age;
    }

    public Employee(String fullName, String post, String email, int phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", post='" + post + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
