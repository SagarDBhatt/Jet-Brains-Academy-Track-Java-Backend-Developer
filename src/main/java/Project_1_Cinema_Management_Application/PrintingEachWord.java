package Project_1_Cinema_Management_Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingEachWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nameList = new ArrayList<String>();

        while (scanner.hasNext()){
            nameList.add(scanner.next());
        }

        for(String s : nameList){
            System.out.println(s);
        }
    }
}
