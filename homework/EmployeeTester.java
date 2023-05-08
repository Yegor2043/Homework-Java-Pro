package newPro.lesson2.homework;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee[] personArray = new Employee[5];
        personArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 892312312, 30000, 30);
        personArray[1] = new Employee("Samuel Adamson", "Driver", "samuel@mailbox.com", 892312312, 330000, 45);
        personArray[2] = new Employee("Petrov Petr", "Manager", "petrov@mailbox.com", 892312312, 31330, 40);
        personArray[3] = new Employee("Antonov Dmitriy", "Director", "antonov@mailbox.com", 892312312, 45000, 47);
        personArray[4] = new Employee("Brown James", "Doctor", "brown@mailbox.com", 892312312, 130000, 53);


        for (Employee employee : personArray) {
            if (employee.getAge() > 40) {
                System.out.println(employee);
            }
        }
    }
}
