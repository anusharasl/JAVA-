import java.util.Scanner;

public class sal {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Salary: ");
        int salary = sc.nextInt();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        if (salary >= 20000 || age >= 25) {

            System.out.println("Eligible for loan");

            System.out.print("Enter Loan Amount: ");
            int loanAmount = sc.nextInt();

            if (loanAmount <= 50000) {
                System.out.println("You are eligible for loan.");
            } else {
                System.out.println("Maximum loan amount is 50000.");
            }

        } else {
            System.out.println("You are not eligible for loan.");
        }

        sc.close();
    }
}