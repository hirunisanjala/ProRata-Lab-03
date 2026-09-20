import java.util.Scanner;

public class IT23249820Lab3Q1B {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double DISCOUNT_RATE = 0.10;

        System.out.print("Enter the price of 1kg of rice: ");
        double price = input.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = input.nextDouble();

        double totalAmount = price * kilograms;
        double discount = totalAmount * DISCOUNT_RATE;
        double amountAfterDiscount = totalAmount - discount;

        System.out.println();
        System.out.println(
                "The total amount with 10% discount is: "
                        + amountAfterDiscount
        );

        input.close();
    }
}