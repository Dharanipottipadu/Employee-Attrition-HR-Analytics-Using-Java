import java.util.List;

public class AttritionAnalyzer {

    public static double calculateAttritionRate(List<Employee> employees) {
        int leftCount = 0;

        for (Employee emp : employees) {
            if (emp.hasLeft()) {
                leftCount++;
            }
        }
        return (leftCount * 100.0) / employees.size();
    }

    public static void identifyHighRiskEmployees(List<Employee> employees) {
        System.out.println("High Attrition Risk Employees:");

        for (Employee emp : employees) {
            if (emp.getSalary() < 30000 && emp.getYearsAtCompany() < 2) {
                System.out.println("Employee ID: " + emp.getId());
            }
        }
    }
}
