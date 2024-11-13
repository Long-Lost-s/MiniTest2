public class Main {
    public static void main(String[] args) {
        Employee nhanviena = new FullTimeEmployee(1, "Long", 18, 123, "Long@", 20000000, 300000, 500000);
        Employee nhanvienb = new FullTimeEmployee(2, "LnoG", 19, 124, "LnoG@", 20000000, 200000, 100000);
        Employee nhanvienc = new FullTimeEmployee(3, "LongH", 21, 126, "LongH@", 20000000, 500000, 300000);
        Employee nhanviend = new FullTimeEmployee(4, "LongU", 28, 127, "LongU@", 20000000, 100000, 500000);

        Employee nhanviene = new PartTimeEmployee(0, "Hoang", 15, 145, "Hoang@", 80);
        Employee nhanvienf = new PartTimeEmployee(1, "HoangH", 16, 185, "HoangH@", 70);
        Employee nhanvieng = new PartTimeEmployee(2, "HoangU", 17, 175, "HoangU@", 74);

        Employee[] employee ={nhanviena, nhanvienb, nhanvienc, nhanviend, nhanviene, nhanvienf, nhanvieng};
        EmployeeList employeeList = new EmployeeList(employee);

        System.out.println("Average wage is: " + (long) employeeList.getAverageWage());
        System.out.println("Number of employees with lower than average wage : " + employeeList.getCouldBeLowWage());
        System.out.println("Total part time wage is: " + (long) employeeList.getTotalPartTimeWage());
    }
}