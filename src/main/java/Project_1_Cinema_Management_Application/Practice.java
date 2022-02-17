package Project_1_Cinema_Management_Application;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice {

    public static ArrayList<ArrayList<String>> al = new ArrayList<ArrayList<String>>();

    public static void main(String[] args) {
        //System.out.println(9/2);
        //printSeat(1,2);

        String[][] arrayS = new String[5][5];
        //printAL(4, 4);

        printAL(4,4);

    }//END OF main()

    public static void printSeat(int... a){
        int[] b = a;

        System.out.println(Arrays.asList(b));
    }//END OF printSeat()

    public static void printS(int num_of_rows, int num_of_seats, String[][] arrayS){

        for( int i = 0; i < arrayS.length; i++){

            for( int j = 0; j < arrayS[i].length ; j++){

                if(i == 0 && j == 0)
                    arrayS[i][j] = " ";

                if(i == 0 )
                    arrayS[0][j] = String.valueOf(j);

                else if ( j == 0)
                    arrayS[i][0] = String.valueOf(i);

                else
                    arrayS[i][j] = "S ";

            }//END OF FOR J

            System.out.println("");
        }//END OF FOR I

        System.out.println("Printing the Array == ");

        for( int i = 0; i < arrayS.length; i++) {
            for (int j = 0; j < arrayS[i].length - 1; j++) {
                System.out.print(arrayS[i][j]);
            }
        }

    }//END OF printS()

    public static void printAL(int num_rows, int num_seats){

        for(int i = 0; i < num_rows + 1; i++){

            ArrayList<String> row = new ArrayList<String>();

            for(int j = 0; j < num_seats + 1; j++){

                if(i == 0 && j == 0)
                    row.add(" ");

                if(i == 0)
                    row.add(j+1 + " ");

                else if( j == 0)
                    row.add(i + " ");

                else
                    row.add("S ");

            }//END OF J
            al.add(row);
        }//END OF I

        //Iterating the ArrayList<>
        for(int m=0; m < al.size(); m++){
            for(int n=0; n < al.size(); n++){
                System.out.print(al.get(m).get(n));
            }
            System.out.println();
        }

        System.out.println("Setting 3rd row and 4th column to - B ");
        al.get(3).set(4, "B");

        //Iterating the ArrayList<>
        for(int m=0; m < al.size(); m++){
            for(int n=0; n < al.size(); n++){
                System.out.print(al.get(m).get(n));
            }
            System.out.println();
        }

    }

}//END OF CLASS
