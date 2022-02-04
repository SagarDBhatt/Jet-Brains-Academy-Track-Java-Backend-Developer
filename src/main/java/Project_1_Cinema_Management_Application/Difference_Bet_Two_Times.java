/**
 * Find how many seconds passed between the two moments of time on the same day.
 *
 * You are given the integer values representing these moments: hours, minutes and seconds for each of them. It is guaranteed that the earlier moment goes first in the input.
 *
 * Input data format
 *
 * The program gets the input of six integers: three defining the first moment of time in hours, minutes, seconds, and the other three defining the second one.
 *
 * For example, six numbers 1, 2, 30, 15, 21, 1 will represent two moments of time: 1:02:30 am and 3:21:01 pm (or just 15:21:01).
 *
 * Output data format
 *
 * Just one number: seconds between these two moments of time. It's 51511 (14 hours, 18 minutes and 31 seconds) in our example.
 *
 *  Report a typo
 * Sample Input 1:
 *
 * 1
 * 1
 * 1
 * 2
 * 2
 * 2
 * Sample Output 1:
 *
 * 3661
 * Sample Input 2:
 *
 * 1
 * 2
 * 30
 * 1
 * 3
 * 20
 * Sample Output 2:
 *
 * 50
 */

package Project_1_Cinema_Management_Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Difference_Bet_Two_Times {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> timeList = new ArrayList<Integer>();

        while(scanner.hasNext()){
            timeList.add(scanner.nextInt());
        }
//        System.out.println("All the times - ");
//        for(int i : timeList){
//            System.out.println(i);
//        }

        int total_seconds_first_time = timeList.get(0) * 3600 + timeList.get(1) * 60 + timeList.get(2);
        int total_seconds_second_time = timeList.get(3) * 3600 + timeList.get(4) * 60 + timeList.get(5);

        System.out.println(total_seconds_second_time - total_seconds_first_time);
    }
}
