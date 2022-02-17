/**
 * Description
 * The theatre is getting popular, and the customers started complaining that it's not practical that the program stops after buying one ticket. Let's add a menu that will allow them to buy tickets and display the current state of the seating arrangement when needed.
 *
 * Objectives
 * At the start, your program should read two positive integer numbers that represent the number of rows and seats in each row. Then, it should print a menu with the following three items:
 *
 * Show the seats should print the current seating arrangement. The empty seats should be marked with an S symbol, and taken seats are marked with a B symbol.
 * Buy a ticket should read the seat coordinates from the input and print the ticket price like in the previous stage. After that, the chosen seat should be marked with a B when the item Show the seats is called.
 * Exit should stop the program.
 * Example
 * The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.
 *
 * Enter the number of rows:
 * > 7
 * Enter the number of seats in each row:
 * > 7
 *
 * 1. Show the seats
 * 2. Buy a ticket
 * 0. Exit
 * > 1
 *
 * Cinema:
 *   1 2 3 4 5 6 7
 * 1 S S S S S S S
 * 2 S S S S S S S
 * 3 S S S S S S S
 * 4 S S S S S S S
 * 5 S S S S S S S
 * 6 S S S S S S S
 * 7 S S S S S S S
 *
 * 1. Show the seats
 * 2. Buy a ticket
 * 0. Exit
 * > 2
 *
 * Enter a row number:
 * > 4
 * Enter a seat number in that row:
 * > 5
 * Ticket price: $10
 *
 * 1. Show the seats
 * 2. Buy a ticket
 * 0. Exit
 * > 1
 *
 * Cinema:
 *   1 2 3 4 5 6 7
 * 1 S S S S S S S
 * 2 S S S S S S S
 * 3 S S S S S S S
 * 4 S S S S B S S
 * 5 S S S S S S S
 * 6 S S S S S S S
 * 7 S S S S S S S
 *
 * 1. Show the seats
 * 2. Buy a ticket
 * 0. Exit
 * > 2
 *
 * Enter a row number:
 * > 6
 * Enter a seat number in that row:
 * > 6
 * Ticket price: $10
 *
 * 1. Show the seats
 * 2. Buy a ticket
 * 0. Exit
 * > 1
 *
 * Cinema:
 *   1 2 3 4 5 6 7
 * 1 S S S S S S S
 * 2 S S S S S S S
 * 3 S S S S S S S
 * 4 S S S S B S S
 * 5 S S S S S S S
 * 6 S S S S S B S
 * 7 S S S S S S S
 *
 * 1. Show the seats
 * 2. Buy a ticket
 * 0. Exit
 * > 0
 */


package Project_1_Cinema_Management_Application.Projects;

import java.util.ArrayList;
import java.util.Scanner;

public class PR_4_SeatingArrangement_View {

    public static ArrayList<ArrayList<String>> al_seating;
    public static int num_of_rows;
    public static int num_of_seats_each_row;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        num_of_rows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row:");
        num_of_seats_each_row = scanner.nextInt();
        System.out.println("");

        al_seating = new ArrayList<ArrayList<String>>(num_of_rows);

        int action_number = 1;

        while (action_number != 0){
            System.out.println("");
            System.out.println("1. Show the seats \n2. Buy a ticket \n0. Exit");
            action_number = scanner.nextInt();
            choose_an_action(action_number, num_of_rows, num_of_seats_each_row);
        }

    }//END OF MAIN

    /**
     *Call Choose an action method.
     *1. Show the seats
     * 2. Buy a ticket
     * 0. Exit
     * @param num_action
     */
    public static void choose_an_action(int num_action, int num_of_rows, int num_of_seats_each_row){

        switch (num_action){
            case 0:
                break;

            case 1:
                //printSeatingArrangement(num_of_rows, num_of_seats_each_row);
                iterating_arrayList();
                break;

            case 2:
                if(al_seating.isEmpty()){
                    updateSeatingArrangement(num_of_rows,num_of_seats_each_row);
                }
                buy_a_ticket(num_of_rows, num_of_seats_each_row);
                break;

            default:
                System.out.println("Invalid input. Try again. ");
        }

    }//END OF choose_an_action()

    public static void updateSeatingArrangement(int num_of_rows, int num_of_seats_each_row) {

        for( int i = 0; i < num_of_rows + 1; i++){
            ArrayList<String> row = new ArrayList<String>();
            for( int j = 0; j < num_of_seats_each_row + 1 ; j++){
                if(i == 0 && j == 0)
                    row.add("  ");
                if(i == 0 && j != num_of_seats_each_row)
                    row.add(j+1 + " ");
                else if ( j == 0)
                    row.add(i + " ");
                else if(i != 0)
                    row.add("S ");
                else
                    break;
            }//END OF FOR J
            al_seating.add(row);
        }//END OF FOR I

    }//END OF printSeatingArrangement()

    public static void buy_a_ticket(int num_of_rows, int num_of_seats_each_row){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a row number:");
        int ticket_row_num = scanner.nextInt();

        System.out.println("Enter a seat number in that row:");
        int ticket_seat_num = scanner.nextInt();

        if( (num_of_rows * num_of_seats_each_row) < 60)
            System.out.println("Ticket price: $10");

        else if( ticket_row_num <= num_of_rows/2)
            System.out.println("Ticket price: $10");

        else
            System.out.println("Ticket price: $8");

        al_seating.get(ticket_row_num).set(ticket_seat_num, "B ");

    }

    public static void iterating_arrayList(){
        if(al_seating.isEmpty())
            updateSeatingArrangement(num_of_rows, num_of_seats_each_row);

        System.out.println("Cinema:");

        for(int i = 0; i < al_seating.size(); i++){
            for(int j=0; j < al_seating.get(i).size(); j++){
                System.out.print(al_seating.get(i).get(j));
            }
            System.out.println();
        }
    }

}//END OF CLASS
