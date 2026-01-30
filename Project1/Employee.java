public class Employee {
    private int id;
    private int age;
    private double salary;
    private int yearsAtCompany;
    private boolean attrition;

    public Employee(int id, int age, double salary, int yearsAtCompany, boolean attrition) {
        this.id = id;
        this.age = age;
        this.salary = salary;
        this.yearsAtCompany = yearsAtCompany;
        this.attrition = attrition;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearsAtCompany() {
        return yearsAtCompany;
    }

    public boolean hasLeft() {
        return attrition;
    }
}
