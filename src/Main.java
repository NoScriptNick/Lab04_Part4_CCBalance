import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables
        int balance = 5000;
        double total;
        double totalTwo;

        total = balance * 1.17;
        totalTwo = total * 1.17;
        System.out.println("The total balance after one month is $" + total);
        System.out.println("The total balance after two months is $" + totalTwo);
    }
}