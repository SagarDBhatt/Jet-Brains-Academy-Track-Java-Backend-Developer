/**
 * Description
 * When choosing a ticket you are guided not only by your space preference but also by your finances. Let's implement the opportunity to check the ticket price and see the reserved seat.
 *
 * Objectives
 * Read two positive integer numbers that represent the number of rows and seats in each row and print the seating arrangement like in the first stage. Then, read two integer numbers from the input: a row number and a seat number in that row. These numbers represent the coordinates of the seat according to which the program should print the ticket price. The ticket price is determined by the same rules as the previous stage:
 *
 * If the total number of seats in the screen room is not more than 60, then the price of each ticket is 10 dollars.
 * In a larger room, the tickets are 10 dollars for the front half of the rows and 8 dollars for the back half. Please note that the number of rows can be odd, for example, 9 rows. In this case, the first half is the first 4 rows, and the second half is the last 5 rows.
 * After that, the program should print out all the seats in the screen room as shown in the example and mark the chosen seat by the B symbol. Finally, it should print the ticket price and stop. Note that in this project, the number of rows and seats won't be greater than 9.
 *
 * Examples
 * The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.
 *
 * Example 1
 *
 * Enter the number of rows:
 * > 7
 * Enter the number of seats in each row:
 * > 8
 *
 * Cinema:
 *   1 2 3 4 5 6 7 8
 * 1 S S S S S S S S
 * 2 S S S S S S S S
 * 3 S S S S S S S S
 * 4 S S S S S S S S
 * 5 S S S S S S S S
 * 6 S S S S S S S S
 * 7 S S S S S S S S
 *
 * Enter a row number:
 * > 3
 * Enter a seat number in that row:
 * > 6
 *
 * Ticket price: $10
 *
 * Cinema:
 *   1 2 3 4 5 6 7 8
 * 1 S S S S S S S S
 * 2 S S S S S S S S
 * 3 S S S S S B S S
 * 4 S S S S S S S S
 * 5 S S S S S S S S
 * 6 S S S S S S S S
 * 7 S S S S S S S S
 * Example 2
 *
 * Enter the number of rows:
 * > 8
 * Enter the number of seats in each row:
 * > 9
 *
 * Cinema:
 *   1 2 3 4 5 6 7 8 9
 * 1 S S S S S S S S S
 * 2 S S S S S S S S S
 * 3 S S S S S S S S S
 * 4 S S S S S S S S S
 * 5 S S S S S S S S S
 * 6 S S S S S S S S S
 * 7 S S S S S S S S S
 * 8 S S S S S S S S S
 *
 * Enter a row number:
 * > 6
 * Enter a seat number in that row:
 * > 5
 *
 * Ticket price: $8
 *
 * Cinema:
 *   1 2 3 4 5 6 7 8 9
 * 1 S S S S S S S S S
 * 2 S S S S S S S S S
 * 3 S S S S S S S S S
 * 4 S S S S S S S S S
 * 5 S S S S S S S S S
 * 6 S S S S B S S S S
 * 7 S S S S S S S S S
 * 8 S S S S S S S S S
 */

package Project_1_Cinema_Management_Application.Projects;

import java.util.Scanner;

public class Pt3_SoldTicket_SeatArrangements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int num_rows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int num_seats = scanner.nextInt();

        /**
         * Print the seating arrangement of the cinema:
         */
        printSeatArrangements(num_rows, num_seats);

        System.out.println("Enter a row number:");
        int ticket_row_num = scanner.nextInt();

        System.out.println("Enter a seat number in that row:");
        int ticket_seat_num = scanner.nextInt();

        //System.out.println("");
        /**
         * Calculate the ticket price
         */
        calc_ticket_price(num_rows, num_seats, ticket_row_num, ticket_seat_num);

        //System.out.println("");

        /**
         * Print the selected Seat as "B"
         */
        print_selected_seat(num_rows, num_seats, ticket_row_num, ticket_seat_num);


    }//END OF MAIN

    public static void printSeatArrangements(int num_rows, int num_seats){
//        int[][] table = new int[num_rows][num_seats];
        System.out.println("Cinema:");

        for(int i = 0; i <= num_rows; i++){
            for(int j = 0; j <= num_seats; j++){

                if(i == 0 && j == 0)
                    System.out.print("  ");
                if(i == 0){
                    if(j == num_seats){
                        break;
                    }
                    System.out.print(j+1 + " ");
                }
                else if(j == 0)
                    System.out.print(i + " ");
                else
                    System.out.print("S ");

            }//END OF FOR J

            System.out.println();
        }//END OF FOR I
    }//END OF printSeatArrangements()

    public static void calc_ticket_price(int num_rows, int num_seats, int ticket_row_num, int ticket_seat_num ){

        if(num_rows * num_seats <= 60){
            //System.out.println("Ticket price: $" + num_rows * num_seats * 10);
            System.out.println("Ticket price: $" + 10);
        }
        else{
            if(ticket_row_num <= num_rows/2)
                System.out.println("Ticket price: $" + 10);
            else
                System.out.println("Ticket price: $" + 8);
            //System.out.println("Ticket price: $" + ( ((num_rows/2) * num_seats * 10) + ((num_rows - num_rows/2) * num_seats * 8) ) );
            //System.out.println("Ticket price: $" + 8);
        }
    }//END OF calc_ticket_price

    public static void print_selected_seat(int num_rows, int num_seats, int ticket_num_row, int ticket_num_seat){
        System.out.println("Cinema:");

        for(int i = 0; i <= num_rows; i++){
            for(int j = 0; j <= num_seats; j++){

                if(i == 0 && j == 0)
                    System.out.print("  ");
                if(i == 0){
                    if(j == num_seats){
                        break;
                    }
                    System.out.print(j+1 + " ");
                }
                else if(j == 0)
                    System.out.print(i + " ");
                else if( i == ticket_num_row && j == ticket_num_seat)
                    System.out.print("B ");
                else
                    System.out.print("S ");

            }//END OF FOR J

            System.out.println();
        }//END OF FOR I

    }//END OF print_selected_seat()

}//END OF CLASS
