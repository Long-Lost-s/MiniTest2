public class EmployeeList {
    private Employee[] employees;

    public EmployeeList() {}

    public EmployeeList(Employee[] employees) {
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public double getAverageWage() {
        double totalWage = 0;
        for (Employee employee : employees) {
            totalWage += employee.getWage();
        }
        return employees.length == 0 ? 0 : totalWage / employees.length;
    }

    public int getCouldBeLowWage(){
        int lowWage = 0;
        for (Employee employee : employees) {
            if (employee instanceof FullTimeEmployee) {
                FullTimeEmployee fullTimeEmployee = (FullTimeEmployee) employee;
                if (fullTimeEmployee.getWage() < lowWage) {
                    lowWage++;
                }
            }
        }
        return lowWage;
    }

    public double getTotalPartTimeWage() {
        double totalPartTimeWage = 0;
        for (Employee employee : employees) {
            if (employee instanceof PartTimeEmployee) {
                PartTimeEmployee partTimeEmployee = (PartTimeEmployee) employee;
                totalPartTimeWage += partTimeEmployee.getWage();
            }
        }
        return totalPartTimeWage;
    }
}
