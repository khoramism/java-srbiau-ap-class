package tamrin3s2;
import java.util.Scanner;

public class Third {
    public static void main(String[]args) {
        // getting the vars 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a : ");
        float a = scanner.nextFloat();
        System.out.println("Enter b : ");
        float b = scanner.nextFloat();
        System.out.println("Enter c : ");
        float c = scanner.nextFloat();
        System.out.println("Enter d : ");
        float d = scanner.nextFloat();
        System.out.println("Enter e : ");
        float e = scanner.nextFloat();
        System.out.println("Enter f : ");
        float f = scanner.nextFloat();

        float x = ( e * d - b * f ) / ( a * d - b * c );
        float y = ( a * f - e * c ) / ( a * d - b * c );

        if ( a * d - b * c == 0 ) {
            System.out.println("There is no answer with these vars");
        } else {
            System.out.println("x is : " + x);
            System.out.println("y is : " + y);
        }

    }
}