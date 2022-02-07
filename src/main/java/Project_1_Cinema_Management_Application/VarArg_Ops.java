package Project_1_Cinema_Management_Application;

import java.util.Arrays;

public class VarArg_Ops {

    public static void main(String[] args) {
        printVarArg(40, 2, 4, 4, 5, 6);
        onlyVarArgs(3,4);
    }

    public static void printVarArg(int a, Object... b){
        System.out.println(a + " -- " + Arrays.asList(b));
    }

    public static void onlyVarArgs(Object... c){
        System.out.println("Var length Args == " + Arrays.asList(c));
    }
}
