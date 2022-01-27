/**
 * Write a program that calculates the sum of the elements of an array of ints.
 *
 * Input data format
 *
 * The first line contains the size of an array.
 * The second line contains elements of the array separated by spaces.
 *
 * Output data format
 *
 * The sum of the input array elements.
 * Sample Input 1:
 *
 * 3
 * 1 2 3
 * Sample Output 1:
 *
 * 6
 * Sample Input 2:
 *
 * 5
 * -1 0 1 2 -2
 * Sample Output 2:
 *
 * 0
 */


package Project_1_Cinema_Management_Application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SumOfArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int array[] = new int[arraySize];
        int sum=0;

        for(int i=0;i<array.length;i++){
            array[i] = scanner.nextInt();
            sum += array[i];
        }

        System.out.println(sum);
        System.out.println(Arrays.toString(array));

//        List<Integer> ls_array = new ArrayList<Integer>();
//        while(scanner.hasNextLine()){
//            System.out.println("Inside while");
//            ls_array.add(scanner.nextInt());
//        }
//
//        System.out.println("Outside While");
//        Object[] arry = ls_array.toArray();
//        System.out.println(arry);


    }
}
