package Project_1_Cinema_Management_Application;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GuestList2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> guestList = new ArrayList<String>();

        while (scanner.hasNext()){
            guestList.add(scanner.next());
        }
        for(int i = guestList.size() - 1; i >= 0; i--){
            System.out.println(guestList.get(i));
        }
    }
}
