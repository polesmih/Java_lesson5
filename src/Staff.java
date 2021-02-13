import java.util.Arrays;

public class Staff {
    String fullName;
    String post;
    String email;
    String phone;
    int salary;
    int age;

    public Staff(String fullName, String post, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String toString() {
        return String.format("ФИО: " + fullName + "; должность: " + post + "; email: " + email + "; телефон: " + phone + "; зарплата: " + salary + "; возраст: " + age);
    }

    public void info() {
        System.out.println(this);
    }
}