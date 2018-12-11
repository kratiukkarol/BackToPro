import java.util.InputMismatchException;
import java.util.Scanner;

public class Example3 {

    private Scanner input = new Scanner(System.in);

    public static void main(String... args){
        System.out.println("Type a number");
        Example3 example3 =new Example3();
        System.out.println("Square root of typed number is: " + example3.calculate());
    }

    private double calculate() {
        int number = 0;
        while (true) {
            try {
                number = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("This is not a number. Type a number");
                input.next();
            }
        }
        if (number<0){
            throw new IllegalArgumentException(String.format("Square root of typed number %.4f doesn't exist.", number));
        }

        return Math.sqrt(number);
    }

}
