import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a 4 digit year");
        int year = myScan.nextInt();
        /* using MATHEMATICAL operations (no Strings), split a year
        Example: if the user enters 1989, the output would be:
        1
        9
        8
        9

         */

        /*

        During the first construction of the code, I had the idea of using modulus to take the last digit of
        the given number. however, it would result in printing the year backwards. For example :

        If the user entered 1984, the output would've been:
        4
        8
        9
        1

        In order to resolve this backwards problem, I would have to take the reverse of the digit and then count it
        from the first initial digits.

        */

        int reverse = 0; // setting up reverse variable
        int origin = year; // cloning the input variable, we still need the year for later
        for (int i = 1; i <= 4; i++) { // looping through the 4 digits
            int digit = origin % 10; // take the last digit
            origin /= 10; // subtract that last digit
            reverse = reverse * 10 + digit; // place that digit in the front
        }

        for (int i = 0; i <= 3; i++) // looping through the 4 digits
        {
            System.out.println(reverse % 10); // print out the inverse, going from ascending order
            reverse /= 10; // take out ascending digit
        }

        /*
        1984
        1
        9
        8
        4

        2016
        2
        0
        1
        6

        9831
        9
        8
        3
        1
        */
    }
}
//Comment on how you tested the code to make sure it works in all situations
//include tests that you ran