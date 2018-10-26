import java.util.Scanner;

public class Methods {

    public static void main(String[] args){
        System.out.println("Type a number");
        isPositive();
    }

    private static boolean isPositive() {
        Scanner in = new Scanner(System.in);
        int result = in.nextInt();
        if(result>=0){
            System.out.println("Number is positive");
            return true;
        } else{
            System.out.println("Number is negative");
            return false;
        }

    }
}
