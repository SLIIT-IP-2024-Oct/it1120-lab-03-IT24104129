import java.util.Scanner;
 public class IT24104129Lab3Q1B{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the price of 1kg of rice: ");
    double pricePerKg = input.nextDouble();
    System.out.print("Enter the number of kilograms you want to buy: ");
    double kilograms = input.nextDouble();
    double totalAmount = pricePerKg * kilograms;
    double Discount = 0.9 * totalAmount;
    System.out.println("The total amount with 10% discount is: " + Discount);    
    input.close();
    }
}