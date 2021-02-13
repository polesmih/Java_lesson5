package lesson5;

public class Lesson5 {
}

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



public class Main {
    public static void main(String[] args) {
        extraInfo();
    }

    static void extraInfo() {
        Staff[] staffArray = new Staff[5];
        staffArray[0] = new Staff("Иванов Иван Иванович", "менеджер", "ivanov@mail.com", "8921145568", 30000, 35);
        staffArray[1] = new Staff("Волков Леонид Петрович", "инженер", "volkov@mail.com", "8911025856", 55000, 45);
        staffArray[2] = new Staff("Федорова Елена Олеговна", "секретарь", "fedorova@mail.com", "8911896111", 25000, 25);
        staffArray[3] = new Staff("Арков Сергей Сергеевич", "чертежник", "arkov@mail.com", "8920051441", 50000, 40);
        staffArray[4] = new Staff("Фанова Ирина Львовна", "оценщик", "fanova@mail.com", "8921147741", 48000, 41);

        System.out.println("Сотрудники, старше 40 лет:");

        for (int i = 0; i < staffArray.length; i++)
            if (staffArray[i].age >= 40)
                staffArray[i].info();
    }
}
