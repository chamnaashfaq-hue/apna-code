public class salary {
    public static double calculateSalary(double baseSalary, double bonus) {
        return baseSalary + bonus;
    }
    
    public static double calculateSalary(int hoursWorked, double hourlyRate) {
        return hoursWorked * hourlyRate;
    }
    
    public static void main(String[] args) {
        double fullTimeSalary = calculateSalary(50000.0, 5000.0);
        System.out.println("Full-time salary: $" + fullTimeSalary);

        double partTimeSalary = calculateSalary(40, 25.0);
        System.out.println("Part-time salary (40 hours @ $25/hr): $" + partTimeSalary);
    }
}
