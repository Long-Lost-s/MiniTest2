public class PartTimeEmployee extends Employee {
    private double workHours;

    public PartTimeEmployee(int ID, String name, int age, double phoneNumber, String email, double workHours) {
        super(ID, name, age, phoneNumber, email);
        this.workHours = workHours;
    }

    public double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    public double getWage() {
        return workHours * 100000;
    }
}
