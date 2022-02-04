/**
 * Given a natural number, not greater than 10000. Output the even number following this number.
 *
 * Hint
 *
 *  Report a typo
 * Sample Input 1:
 *
 * 7
 * Sample Output 1:
 *
 * 8
 * Sample Input 2:
 *
 * 8
 * Sample Output 2:
 *
 * 10
 */

package Project_1_Cinema_Management_Application;

import java.util.Scanner;

public class Find_Even_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        for(int i = inputNumber+1; i < 2 * inputNumber; i++){
            if(i % 2 == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
