package lesson2;

public class Employee {
    private String firstName;
    private String lastName;
    private String middleName;
    private String jobTitle;
    private String email;
    private String phone;
    private float salary;
    private int age;

    public Employee(String firstName, String lastName, String middleName, String jobTitle, String email, String phone, float salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printEmployee(Employee employee) {
        System.out.println(employee.toString());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

}

