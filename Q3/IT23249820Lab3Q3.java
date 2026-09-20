import java.util.Scanner;

public class IT23249820Lab3Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Rupee amount: ");
        int amount = input.nextInt();

        int remainingAmount = amount;

        int notes5000 = remainingAmount / 5000;
        remainingAmount = remainingAmount % 5000;

        int notes1000 = remainingAmount / 1000;
        remainingAmount = remainingAmount % 1000;

        int notes500 = remainingAmount / 500;
        remainingAmount = remainingAmount % 500;

        int notes200 = remainingAmount / 200;
        remainingAmount = remainingAmount % 200;

        int notes100 = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int notes50 = remainingAmount / 50;
        remainingAmount = remainingAmount % 50;

        int notes20 = remainingAmount / 20;
        remainingAmount = remainingAmount % 20;

        int coins10 = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int coins5 = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int coins2 = remainingAmount / 2;
        remainingAmount = remainingAmount % 2;

        int coins1 = remainingAmount;

        System.out.println();
        System.out.println("5000 Notes - " + notes5000);
        System.out.println("1000 Notes - " + notes1000);
        System.out.println("500 Notes - " + notes500);
        System.out.println("200 Notes - " + notes200);
        System.out.println("100 Notes - " + notes100);
        System.out.println("50 Notes - " + notes50);
        System.out.println("20 Notes - " + notes20);
        System.out.println("10 Coins - " + coins10);
        System.out.println("05 Coins - " + coins5);
        System.out.println("02 Coins - " + coins2);
        System.out.println("01 Coins - " + coins1);

        input.close();
    }
}