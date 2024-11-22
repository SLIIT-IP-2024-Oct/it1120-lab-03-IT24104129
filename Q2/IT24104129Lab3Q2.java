import java.util.Scanner;

public class IT24104129Lab3Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Monthly Salary: ");
        double monthlySalary = input.nextDouble();
        System.out.print("Enter the number of OT Hours: ");
        double otHours = input.nextDouble();
        System.out.print("Enter OT Hourly Rate: ");
        double otHourlyRate = input.nextDouble();
        double otAmount = otHours * otHourlyRate;
        double totalSalary = monthlySalary + otAmount;
        System.out.println("The total Salary including OT is: " + totalSalary);
    }
}