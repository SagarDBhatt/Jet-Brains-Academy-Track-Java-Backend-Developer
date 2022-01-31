/**
 * Objectives
 * In this stage, you need to read two positive integer numbers from the input: the number of rows and the number of seats in each row. The ticket price is determined by the following rules:
 *
 * If the total number of seats in the screen room is not more than 60, then the price of each ticket is 10 dollars.
 * In a larger room, the tickets are 10 dollars for the front half of the rows and 8 dollars for the back half. Please note that the number of rows can be odd, for example, 9 rows. In this case, the first half is the first 4 rows, and the second half is the other 5 rows.
 * Calculate the profit from the sold tickets depending on the number of seats and print the result as shown in the examples below. After that, your program should stop. Note that in this project, the number of rows and seats won't be greater than 9.
 *
 * Examples
 * The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.
 *
 * Example 1
 *
 * Enter the number of rows:
 * > 4
 * Enter the number of seats in each row:
 * > 5
 * Total income:
 * $200
 * Example 2
 *
 * Enter the number of rows:
 * > 8
 * Enter the number of seats in each row:
 * > 9
 * Total income:
 * $648
 * Example 3
 *
 * Enter the number of rows:
 * > 9
 * Enter the number of seats in each row:
 * > 7
 * Total income:
 * $560
 */

package Project_1_Cinema_Management_Application;

import java.awt.*;
import java.util.Scanner;

public class Sold_Ticket_Income {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int num_rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int num_cols = scanner.nextInt();

        System.out.println("Total income:");
        if(num_rows * num_cols < 60){
            System.out.println("$" + num_rows * num_cols * 10);
        }
        else{
            System.out.println("$" + ( ((num_rows/2) * num_cols * 10) + ( (num_rows - (num_rows/2)) * num_cols * 8 )  ) );
        }
    }
}
