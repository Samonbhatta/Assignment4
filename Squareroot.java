

import java.util.Scanner;

public class Squareroot{

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println( "Please enter a number" );
        String number = scanner.next();
        Double root = Math.sqrt(  Double.parseDouble(number));
        System.out.println( "The square root of the input number is " +  root );
        

    }
}
