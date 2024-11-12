public class FullTimeEmployee extends Employee{
    private double bonus;
    private double fine;
    private double salary;

    public FullTimeEmployee(int ID, String name, int age, double phoneNumber, String email, double salary, double fine, double bonus) {
        super(ID, name, age, phoneNumber, email);
        this.salary = salary;
        this.fine = fine;
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public double getWage() {
        return salary + (bonus - fine);
    }
}
