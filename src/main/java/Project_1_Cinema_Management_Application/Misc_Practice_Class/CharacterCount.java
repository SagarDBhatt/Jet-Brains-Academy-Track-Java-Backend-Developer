package Project_1_Cinema_Management_Application.Misc_Practice_Class;

import java.util.HashMap;
import java.util.Locale;

public class CharacterCount {

    public static void main(String[] args) {

        String S = "Sagar Bhatt";

        char[] chars = new char[S.length()];
        chars = S.toLowerCase().toCharArray();

        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        for(char ch : chars){
            //System.out.println(ch);
            if(hm.containsKey(ch)){
                int val = hm.get(ch);
                val += 1;
                hm.put(ch, val);
            }
            else
                hm.put(ch, 1);
        }

        System.out.println(hm);

        for(char c : hm.keySet()){
            System.out.println(c + " " + hm.get(c));
        }

    }//END OF MAIN
}//END OF CLASS
