class Employee {

    int id;
    String name;
    String department;
    double salary;

    Employee() {
        id = 0;
        name = "Default";
        department = "Not Assigned";
        salary = 0;
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.id = 0;
        this.department = "Not Assigned";
    }

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + department + " Rs." + salary);
    }
}

public class EmployeeRecordWithConstructorOverloading {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee("Amit", 45000);
        Employee e3 = new Employee(101, "Neha", "IT", 60000);

        System.out.println("Employee 1");
        e1.display();

        System.out.println("Employee 2");
        e2.display();

        System.out.println("Employee 3");
        e3.display();
    }
}