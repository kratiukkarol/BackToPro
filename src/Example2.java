import java.util.Scanner;

public class Example2 {

    private Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        Example2 example = new Example2();
        Computation computation;
        if(example.shouldMultiply()){
            computation = new Multiplication();
        } else {
            computation = new Addition();
        }
        double argument1 = example.getArgument();
        double argument2 = example.getArgument();
        double result = computation.compute(argument1, argument2);
        System.out.println("Result: " + result);
    }

    private double getArgument() {
        System.out.println("Type a number");
        return input.nextDouble();
    }

    private boolean shouldMultiply() {
        System.out.println("Please type \"M\" if you want to multiply. In the other case that will be adding.");
        return input.next().equals("M");
    }

    private static class Multiplication implements Computation {
        @Override
        public double compute(double arg1, double arg2) {
            return arg1 * arg2;
        }
    }

    private static class Addition implements Computation {
        @Override
        public double compute(double arg1, double arg2) {
            return arg1 + arg2;
        }
    }
}
