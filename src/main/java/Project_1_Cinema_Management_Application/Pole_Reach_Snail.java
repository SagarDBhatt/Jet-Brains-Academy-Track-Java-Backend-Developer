/**
 * Snail creeps up a vertical pole of height H feet. It goes A feet up per day, and B feet down per night. On which day will the snail reach the top of the pole?
 *
 * Input data format
 *
 * In the input, the program receives non-negative integers H, A, B, where H > B and A > B. Every integer does not exceed 100.
 *
 *  Report a typo
 * Sample Input 1:
 *
 * 10
 * 3
 * 2
 * Sample Output 1:
 *
 * 8
 * Sample Input 2:
 *
 * 20
 * 7
 * 3
 * Sample Output 2:
 *
 * 5
 */

package Project_1_Cinema_Management_Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pole_Reach_Snail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> heightList = new ArrayList<Integer>();

        while (scanner.hasNext()){
            heightList.add(scanner.nextInt());
        }
        int height = heightList.get(0);
        int growth_daily = heightList.get(1);
        int descend_daily = heightList.get(2);
        int day_counter = 0;

        while (height - growth_daily > 0){
            day_counter += 1;
            height -= (growth_daily - descend_daily);
        }
        System.out.println(day_counter);

    }
}
