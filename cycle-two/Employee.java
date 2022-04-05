public class Employee {
    protected String name, address;
    protected int age, phone;
    protected double salary;

    public Employee(String name, String address, int age, int phone, double salary) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phone = phone;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary: " + this.salary);
    }

    public static void main(String[] args) {
        Officer officer = new Officer("Xyz", "Somewhere", 34, 2320457, 12000, "IT");
        Manager manager = new Manager("Abc", "Somewhere", 47, 2320919, 50000, "CI/CD");
        officer.display();
        manager.display();
    }
}

class Officer extends Employee {
    String specialization;

    public Officer(String name, String address, int age, int phone, double salary, String specialization) {
        super(name, address, age, phone, salary);
        this.specialization = specialization;
    }

    public void display() {
        System.out.println("** Officer Data **");
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Age: " + this.age);
        System.out.println("Phone: " + this.phone);
        this.printSalary();
        System.out.println("Specialization: " + this.specialization);
    }
}

class Manager extends Employee {
    String department;

    public Manager(String name, String address, int age, int phone, double salary, String department) {
        super(name, address, age, phone, salary);
        this.department = department;
    }

    public void display() {
        System.out.println("** Manager Data **");
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Age: " + this.age);
        System.out.println("Phone: " + this.phone);
        this.printSalary();
        System.out.println("Department: " + this.department);
    }
}