package m1q;  //employee   //imp//

class Employee111 {
    String name;
    String ssn;
    String dept;
    int salary;
 
    public Employee111(String name, String ssn, String dept, int salary) {
        this.name = name;
        this.ssn = ssn;
        this.dept = dept;
        this.salary = salary;
    }
}
 
public class EmployeeImplementation{
 
    public static Employee111 getEmployeeInfo(String str) {
        String[] parts = str.split("@|-|#");
 
        String name = parts[0].trim();
        String ssn = parts[1].trim();
        String dept = parts[2].trim();
        int salary = Integer.parseInt(parts[3].trim());
 
        return new Employee111(name, ssn, dept, salary);
    }
 
    public static String getEmployeeDept(Employee111 e) {
        int lastThreeDigits = Integer.parseInt(e.ssn.substring(e.ssn.length() - 3));
 
        if (lastThreeDigits >= 1 && lastThreeDigits <= 60) {
            return "L1";
        } else if (lastThreeDigits >= 61 && lastThreeDigits <= 120) {
            return "L2";
        } else if (lastThreeDigits >= 121 && lastThreeDigits <= 180) {
            return "L3";
        } else {
            return "L4";
        }
    }

 
    public static void main(String[] args) {
        String employeeString = "Rakesh RaJ@1PC16CS046-SDE#8";
        Employee111 employee = getEmployeeInfo(employeeString);
        System.out.println("Name: " + employee.name);
        System.out.println("SSN: " + employee.ssn);
        System.out.println("Dept: " + employee.dept);
        System.out.println("Salary: " + employee.salary);
 
        String deptLevel = getEmployeeDept(employee);
        System.out.println("Dept Level: " + deptLevel);
    }
}
