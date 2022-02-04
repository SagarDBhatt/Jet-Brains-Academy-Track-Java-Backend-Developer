/**
 * Objectives
 * There is not a lot of space in our new cinema theatre, so you need to take into account the restrictions on the number of seats.
 * Your friends said that the room would fit 7 rows of 8 seats. Your task is to help them visualize the seating arrangement by printing the scheme to the console.
 *
 * Your output should be like in the example below and should contain 9 lines.
 */

//          1 2 3 4 5 6 7 8
//        1 S S S S S S S S
//        2 S S S S S S S S
//        3 S S S S S S S S
//        4 S S S S S S S S
//        5 S S S S S S S S
//        6 S S S S S S S S
//        7 S S S S S S S S


package Project_1_Cinema_Management_Application;

public class SeatingArrangement_View {

    public static void main(String[] args) {
        System.out.println("Cinema:");
        for(int i = 1; i <=8; i++){

            for(int j = 1; j <= 9; j++){

                if(i==1){
                    if(j==1)
                        System.out.print("  ");
                    else
                        System.out.print(j-1+ " ");
                }

                else{
                    if(j==1)
                        System.out.print(i-1+ " ");
                    else
                        System.out.print("S ");
                }
            }//END OF J
            System.out.println();
        }//END OF I

    }
}
