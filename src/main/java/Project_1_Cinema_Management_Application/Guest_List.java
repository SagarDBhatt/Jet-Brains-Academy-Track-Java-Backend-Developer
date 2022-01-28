/**
 * PROBLEM STATEMENT:
 * -------------------
 * You have a guest list of the people who registered their stay at the hotel. There are 4 rooms in the hotel: 1 single room, 2 double rooms and 1 family room for three guests. The guest list consists of 4 lines. Each line contains the name or the names of the guests registered together in one room.
 *
 * Read the names of the registered guests from the list and output each name in a separate line and in reverse order starting with the last registered guest. Note that the order of the guests registered in each room is undefined.
 *
 *  Report a typo
 * Sample Input 1:
 *
 * Jane Kate
 * John
 * Mary Susan Paul
 * Boris Ann
 * Sample Output 1:
 *
 * Ann
 * Boris
 * Paul
 * Susan
 * Mary
 * John
 * Kate
 * Jane
 */


package Project_1_Cinema_Management_Application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Guest_List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lsGuest = new ArrayList<String>();

        while(scanner.hasNextLine()){
            String[] tokens = scanner.nextLine().split("\\s");
            for(String s : tokens){
                lsGuest.add(s);
            }
        }
        scanner.close();

        /**
         * For each loop to print all the String elements of list in order they enter.
         */
        for(String s : lsGuest){
            System.out.println(s);
        }
        /**
         * Simple For loop to get the data in reverse order of the insertion.
         */
        for(int i = lsGuest.size()-1; i >= 0; i--){
            System.out.println(lsGuest.get(i));
        }
    }
}
