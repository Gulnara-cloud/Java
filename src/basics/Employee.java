package basics;

public class Employee {
    public int baseSalary;
    public int hourlyRate;
    public int setBaseSalary;

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    public void  setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
    }
    public int getBaseSalary() {
        return baseSalary;
    }
}


