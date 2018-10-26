import java.util.Scanner;

public class Methods {

    private static int result;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Type a number");
        int result = in.nextInt();
        Methods.result = result;
        isPositive();
    }

    private static boolean isPositive() {
        if(result>=0){
            System.out.println("Number is positive");
            return true;
        } else{
            System.out.println("Number is negative");
            return false;
        }
    }
}
