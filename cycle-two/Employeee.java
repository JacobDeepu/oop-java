public class Employeee {
    public void display(){
        System.out.println("Employee class");
    }
    public void calcSalary(){
        System.out.println("Salary of employee is 10000");
    }

    public static void main(String[] args) {
        Engineer engineer = new Engineer();
        engineer.display();
        engineer.calcSalary();
    }
}

class Engineer extends Employeee {
    public void calcSalary(){
        System.out.println("Salary of employee is 20000");
    }
}