import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Employee ID: ");
            int id = sc.nextInt();

            sc.nextLine(); // consume newline

            System.out.print("Department: ");
            String dept = sc.nextLine();

            System.out.print("Years of Experience: ");
            int exp = sc.nextInt();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            System.out.print("Left company? (true/false): ");
            boolean left = sc.nextBoolean();

            employees.add(new Employee(id, dept, exp, salary, left));
        }

        AttritionAnalyzer analyzer = new AttritionAnalyzer();

        double rate = analyzer.calculateAttritionRate(employees);
        System.out.println("\nAttrition Rate: " + rate + "%");

        System.out.println("High Attrition Risk Employees:");
        List<Employee> risky = analyzer.getHighRiskEmployees(employees);

        for (Employee e : risky) {
            System.out.println("Employee ID: " + e.getId());
        }

        sc.close();
    }
}
